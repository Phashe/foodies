package com.csc3003s.foodies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class varsityFastFoodMenuItem : AppCompatActivity() {

    //Database connection
    private lateinit var item: FirebaseFirestore
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_varsity_fast_food_menu_item)

        // Defining variables
        var title= findViewById<TextView>(R.id.itemTitle)
        var content = findViewById<TextView>(R.id.itemContent)
        var saveButton = findViewById<ImageButton>(R.id.doneIcone)
        // set on click listener
        saveButton.setOnClickListener{
            var itemTittle =title.text.toString()
            var itemContent = content.text.toString()

            //initialise connection to the database
            auth = FirebaseAuth.getInstance()
            item = FirebaseFirestore.getInstance()
            var addItemMenu: MutableMap<String, Any> = HashMap()


            //check if title is empty
            if(itemTittle.isEmpty()){
                Toast.makeText(applicationContext, "Enter the name of an item", Toast.LENGTH_SHORT).show()
            }else{
                //prepare data
                addItemMenu["name"] = itemTittle
                addItemMenu["content"] = itemContent
            }
            //adding to the database
            item.collection("varsityFastFoodMenuItem")
                .add(addItemMenu).addOnSuccessListener {
                    Toast.makeText(applicationContext, "Item added to the databse", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener{
                    Toast.makeText(applicationContext, "Error occurred", Toast.LENGTH_SHORT).show()
                }

        }
    }
}