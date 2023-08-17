package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        val signIN = findViewById<Button>(R.id.signInButton)
        signIN.setOnClickListener(){
            val logInIntent = Intent(this,VendorActivity::class.java)
            startActivity(logInIntent)
        }
    }
}