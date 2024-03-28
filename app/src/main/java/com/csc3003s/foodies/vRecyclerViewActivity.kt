package com.csc3003s.foodies

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class vRecyclerViewActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var userList: ArrayList<User>
    private var db = Firebase.firestore
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vrecycler_view)



        recyclerView= findViewById(R.id.vrecyclerview)
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

                    recyclerView.adapter = VMyAdapter(userList)
                }
            }
            .addOnFailureListener {
                Toast.makeText(this,it.toString(), Toast.LENGTH_SHORT).show()
            }
    }
}