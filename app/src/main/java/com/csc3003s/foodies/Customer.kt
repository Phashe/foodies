package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Customer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        var SignIn = findViewById<Button>(R.id.signInCustomer)
        SignIn.setOnClickListener(){
            var signInIntent = Intent(this,SignActivity::class.java)
            startActivity(signInIntent)
        }

        var SignUp = findViewById<Button>(R.id.signUpCustomer)
        SignUp.setOnClickListener() {
            var signUpIntent = Intent(this, SignUpActivity::class.java)
            startActivity(signUpIntent)
        }

    }
}