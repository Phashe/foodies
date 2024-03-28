package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.csc3003s.foodies.databinding.ActivityRecyclerViewBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class RecyclerViewActivity : AppCompatActivity() {

    // For my recycle view
    private lateinit var recyclerView: RecyclerView
    private lateinit var userList: ArrayList<User>
    private var db = Firebase.firestore

    // For my floating button
    private lateinit var binding: ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)


        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatingButton.setOnClickListener {
            var reviewPage = Intent(this, ReviewPage::class.java)
            startActivity(reviewPage)

        }

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        userList = arrayListOf()

        db = FirebaseFirestore.getInstance()

        db.collection("Reviews").get()
            .addOnSuccessListener {
                if(!it.isEmpty){
                    for(data in it.documents){
                        val user: User? =data.toObject(User::class.java)
                        if (user != null) {
                            userList.add(user)
                        }
                    }

                    recyclerView.adapter = MyAdapter(userList)
                }
            }
            .addOnFailureListener {
                Toast.makeText(this,it.toString(), Toast.LENGTH_SHORT).show()
            }
    }
}