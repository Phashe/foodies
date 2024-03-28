package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class varsity_fast_food : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_varsity_fast_food)

        // Clicking the review image
        var reviewsIcon = findViewById<ImageView>(R.id.reviews)
        reviewsIcon.setOnClickListener(){

            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,RecyclerViewActivity::class.java)
            startActivity(reviewsOptionsOpen)

        }


    }
}