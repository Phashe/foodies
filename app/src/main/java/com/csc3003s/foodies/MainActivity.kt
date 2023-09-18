package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
        var ivCustomer = findViewById<ImageView>(R.id.customer)
        ivCustomer.setOnClickListener(){
            var customerIntent = Intent(this,Customer::class.java)
            startActivity(customerIntent)
        }
        var ivVendor = findViewById<ImageView>(R.id.vendor)
        ivVendor.setOnClickListener(){
            var vendorIntent = Intent(this,vendor::class.java)
            startActivity(vendorIntent)
        }

        var ivGuest = findViewById<ImageView>(R.id.guest)
        ivGuest.setOnClickListener(){
            var guestIntent = Intent(this,Guest::class.java)
            startActivity(guestIntent)
        }



    }
}