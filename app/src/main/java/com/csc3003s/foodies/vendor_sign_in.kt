package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class vendor_sign_in : AppCompatActivity() {

    //connection to database
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_sign_in)
        //initialise firebase connection
        auth = FirebaseAuth.getInstance()

        // set on click listener for the sign in button
        var signInVendor = findViewById<Button>(R.id.vendorLogin)
        signInVendor.setOnClickListener(){
            val email: EditText = findViewById(R.id.vendorEmail)
            val password: EditText = findViewById(R.id.vendorPassword)
            // check if email or password is empty

            if(email.text.isEmpty() || password.text.isEmpty()){
                Toast.makeText(this,"please enter all the required filled", Toast.LENGTH_SHORT).show()

            }
            // convert email and password into string
            val getEmail = email.text.toString()
            val getPassword = password.text.toString()

            //prepare string to check if the user entered correct email address
            val string = getEmail.split("@")
            val  extention = string[1]

            // let the user sign in
            auth.signInWithEmailAndPassword(getEmail,getPassword)
                .addOnCompleteListener(this) { task ->
                    if (extention.equals("gmail.com")) {
                        if (task.isSuccessful) {
                            // Login successful, user is signed in
                            val logInIntent = Intent(this, VendorOptions::class.java)
                            startActivity(logInIntent)
                            val user = auth.currentUser
                            // Proceed with Firestore data access or other actions
                        } else {
                            // Login failed, handle the error
                            Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }else{
            Toast.makeText(this, "please enter gmail account", Toast.LENGTH_SHORT).show()
        }
                }
           // var signInVendorIntent = Intent(this,VendorOptions::class.java)
           // startActivity(signInVendorIntent)
        }
    }
}