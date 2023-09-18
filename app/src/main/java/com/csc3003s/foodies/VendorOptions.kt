package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class VendorOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_options)
        var ivreviview = findViewById<ImageView>(R.id.vendor_reviews)
        ivreviview.setOnClickListener() {
            var reviewIntent = Intent(this, vendor_review::class.java)
            startActivity(reviewIntent)
        }

        var line_length = findViewById<ImageView>(R.id.line_length)
        line_length.setOnClickListener() {
            var reviewIntent = Intent(this, Line_length::class.java)
            startActivity(reviewIntent)
        }

        var availableItem = findViewById<ImageView>(R.id.available_items)
        availableItem.setOnClickListener() {
            var availableIntent = Intent(this, BestQualityM::class.java)
            startActivity(availableIntent)
        }
    }
}