package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Guest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)
        val signInGuest = findViewById<Button>(R.id.view)
        signInGuest.setOnClickListener(){
            val logInIntent = Intent(this,VendorActivity::class.java)
            startActivity(logInIntent)
        }
    }
}