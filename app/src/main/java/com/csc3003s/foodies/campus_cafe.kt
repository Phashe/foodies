package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class campus_cafe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campus_cafe)

        // Clicking the review image
        var reviewsIcon = findViewById<ImageView>(R.id.reviews4)
        reviewsIcon.setOnClickListener(){

            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,ReviewOrRead::class.java)
            startActivity(reviewsOptionsOpen)

        }
    }
}