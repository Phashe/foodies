package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class VendorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor)

        var varsityFood = findViewById<ImageView>(R.id.varsity_food)
        varsityFood.setOnClickListener(){
            var varsityIntent = Intent(this,varsity_fast_food::class.java)
            startActivity(varsityIntent)

        }

        var ivbestQality = findViewById<ImageView>(R.id.best_quality)
        ivbestQality.setOnClickListener(){
            var bestQualityIntent = Intent(this,best_quality::class.java)
            startActivity(bestQualityIntent)

        }

        var ivbudgetRolls = findViewById<ImageView>(R.id.budget_rolls)
        ivbudgetRolls.setOnClickListener() {
            var budgetRollsIntent = Intent(this, budget_rolls::class.java)
            startActivity(budgetRollsIntent)
        }


        var ivcampusCafe = findViewById<ImageView>(R.id.campus_cafe)
        ivcampusCafe.setOnClickListener() {
            var campusCafeIntent = Intent(this, campus_cafe::class.java)
            startActivity(campusCafeIntent)
        }

        var ivdan = findViewById<ImageView>(R.id.den)
        ivdan.setOnClickListener() {
            var danIntent = Intent(this, dan::class.java)
            startActivity(danIntent)
        }


        var ivprashad = findViewById<ImageView>(R.id.prashad)
        ivprashad.setOnClickListener() {
            var prashadIntent = Intent(this, prashad::class.java)
            startActivity(prashadIntent)
        }
    }
}