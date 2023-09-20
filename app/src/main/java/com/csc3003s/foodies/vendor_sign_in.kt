package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vendor_sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_sign_in)

        var signInVendor = findViewById<Button>(R.id.vendorLogin)
        signInVendor.setOnClickListener(){
            var signInVendorIntent = Intent(this,VendorOptions::class.java)
            startActivity(signInVendorIntent)
        }
    }
}