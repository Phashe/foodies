package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class prashad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prashad)

        // Clicking the review image
        var reviewsIcon = findViewById<ImageView>(R.id.reviews6)
        reviewsIcon.setOnClickListener(){

            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,ReviewOrRead::class.java)
            startActivity(reviewsOptionsOpen)

        }
    }
}