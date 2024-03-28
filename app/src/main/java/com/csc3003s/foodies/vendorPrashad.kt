package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class vendorPrashad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_prashad)

        var reviewsIcon = findViewById<ImageView>(R.id.reviews2)
        reviewsIcon.setOnClickListener(){
            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,vRecyclerViewActivity::class.java)
            startActivity(reviewsOptionsOpen)

        }

    }
}