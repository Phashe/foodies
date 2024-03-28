package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class vendorVarsityFastFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_varsity_fast_food)

        var AvailabileFood = findViewById<ImageView>(R.id.available2)
        AvailabileFood.setOnClickListener(){
            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,bestQualityMenu::class.java)
            startActivity(reviewsOptionsOpen)
        }


        // Clicking the review image
        var reviewsIcon = findViewById<ImageView>(R.id.reviews2)
        reviewsIcon.setOnClickListener(){

            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,vRecyclerViewActivity::class.java)
            startActivity(reviewsOptionsOpen)
        }
    }
}