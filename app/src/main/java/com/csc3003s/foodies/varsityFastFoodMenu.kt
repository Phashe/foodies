package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.firestore.*

class varsityFastFoodMenu : AppCompatActivity() {

    //prepare variables
    lateinit var floatinButton: FloatingActionButton
    private lateinit var recyclerView: RecyclerView
    private lateinit var userArrayList: ArrayList<Users>
    private lateinit var menuAdapter: menuAdapter
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_varsity_fast_food_menu)
        //prepare recycle view
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        // define arraylist and adapter
        userArrayList = arrayListOf()
        menuAdapter = menuAdapter(userArrayList)
        recyclerView.adapter = menuAdapter

        //set onclick listener on add button
        floatinButton = findViewById(R.id.addItem)
        floatinButton.setOnClickListener{
            val addManuItem = Intent(this, varsityFastFoodMenuItem::class.java)//
            startActivity(addManuItem)
        }
        // call the method
        EventChangeListener()
    }
    private fun EventChangeListener(){
        db = FirebaseFirestore.getInstance()
        db.collection("varsityFastFoodMenuItem").
        addSnapshotListener(object : EventListener<QuerySnapshot> {
            override fun onEvent(
                value: QuerySnapshot?,
                error: FirebaseFirestoreException?
            ) {
                if(error !=null){
                    Log.e("firestore error",error.toString())
                    return
                }
                for(dc: DocumentChange in value?.documentChanges!!){

                    if(dc.type== DocumentChange.Type.ADDED){
                        userArrayList.add(dc.document.toObject(Users::class.java))
                    }
                }
                menuAdapter.notifyDataSetChanged()
            }
        })
    }
}