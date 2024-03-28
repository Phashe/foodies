package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ReviewPage : AppCompatActivity() {




    private lateinit var comSec:  FirebaseFirestore
    // Going to auth
    private lateinit var auth: FirebaseAuth




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_page)
        auth = FirebaseAuth.getInstance()

        // What I Typed to connect the review screen to the to the mobile application

        var totalPointsIncreases = findViewById<TextView>(R.id.Points)

        // my submit button
        val subButton = findViewById<Button>(R.id.submitR)

        val user = auth.getCurrentUser()

        /* user?.let{
             val email = it.email
         }*/

        // Get my comment



        subButton.setOnClickListener {
            var comm = findViewById<EditText>(R.id.commentSection)
            var stringComm = comm.text.toString()


            // Creating connection to database
            comSec = FirebaseFirestore.getInstance()
            var review: MutableMap<String, Any> = HashMap()

            var p =0
            var tp = 10
            var totalPoints = p + 10
            p = p + 10
            totalPointsIncreases.text = "Total points: $totalPoints"

            val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
            val ratingBar2 = findViewById<RatingBar>(R.id.ratingBar2)
            val ratingBar3 = findViewById<RatingBar>(R.id.ratingBar3)
            val ratingBar4 = findViewById<RatingBar>(R.id.ratingBar4)

            // Getting Averages of my Rating Bars
            val ratingBarTotal = ratingBar.rating.toInt()
            val ratingBar2Total = ratingBar2.rating.toInt()
            val ratingBar3Total = ratingBar3.rating.toInt()
            val ratingBar4Total = ratingBar4.rating.toInt()

            val ratingSum = ratingBarTotal + ratingBar2Total + ratingBar3Total + ratingBar4Total

            // Total average of my rating bar
            var Average = ratingSum.toFloat()
            var totalRatingAverage = Average/4.0

            // Adding to database
            review["User"] = user?.email.toString()
            review["Vendorname"] = "Khani"
            review["WrittenComment"] = stringComm
            review["RatingAverage"] = totalRatingAverage.toString()

            // Connecting what ive added to the database
            comSec.collection("Reviews")
                .add(review).addOnSuccessListener {
                    Toast.makeText(this, "Successfully added to the database", Toast.LENGTH_SHORT)
                        .show()
                }.addOnFailureListener {
                    Toast.makeText(this, "Failed added to the database", Toast.LENGTH_SHORT).show()
                }


            val returnToComments = Intent(this, RecyclerViewActivity::class.java)
            startActivity(returnToComments)
        }

    }



}