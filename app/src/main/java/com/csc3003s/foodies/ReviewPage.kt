package com.csc3003s.foodies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class ReviewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_page)


        // What I Typed to connect the review screen to the to the mobile application
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val ratingBar2 = findViewById<RatingBar>(R.id.ratingBar2)
        val ratingBar3 = findViewById<RatingBar>(R.id.ratingBar3)
        val ratingBar4 = findViewById<RatingBar>(R.id.ratingBar4)

        // my submit button
        val subButton = findViewById<Button>(R.id.submitR)




    }
}