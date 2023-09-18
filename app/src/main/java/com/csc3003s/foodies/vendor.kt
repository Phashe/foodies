package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vendor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor2)

        var signInVendor = findViewById<Button>(R.id.signInVendor)
        signInVendor.setOnClickListener(){
            var signInVendorIntent = Intent(this,vendor_sign_in::class.java)
            startActivity(signInVendorIntent)
        }

        var signUpVendor = findViewById<Button>(R.id.signUpVendor)
        signUpVendor.setOnClickListener(){
            var signUpVendorIntent = Intent(this,sign_up_vendor::class.java)
            startActivity(signUpVendorIntent)
        }
    }
}