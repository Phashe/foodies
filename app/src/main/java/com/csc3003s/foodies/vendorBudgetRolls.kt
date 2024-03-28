package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class vendorBudgetRolls : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_budget_rolls)

        var AvailabileFood = findViewById<ImageView>(R.id.available2)
        AvailabileFood.setOnClickListener(){
            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,budgetRollsMenu::class.java)
            startActivity(reviewsOptionsOpen)
        }

        var reviewsIcon = findViewById<ImageView>(R.id.brReviews)
        reviewsIcon.setOnClickListener(){
            // Opening reading or writing Screen
            var reviewsOptionsOpen = Intent(this,vRecyclerViewActivity::class.java)
            startActivity(reviewsOptionsOpen)

        }
    }
}