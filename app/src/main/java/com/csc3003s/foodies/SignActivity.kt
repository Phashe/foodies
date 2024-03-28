package com.csc3003s.foodies

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class SignActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)
        auth = FirebaseAuth.getInstance()
        var db = FirebaseFirestore.getInstance()
        val signIN = findViewById<Button>(R.id.signInButton)
        signIN.setOnClickListener {
            // performSignIn()

            val email: EditText = findViewById(R.id.emailAddress)
            val password: EditText = findViewById(R.id.signInPassword)
            if(email.text.isEmpty() || password.text.isEmpty()){
                Toast.makeText(this,"please enter all the required filled", Toast.LENGTH_SHORT).show()
            }
            val getEmail = email.text.toString()
            val getPassword = password.text.toString()
            //val getEmail = "Ndzimande@gmail.com".trim()
            //val getPassword = "456".trim()
            val string = getEmail.split("@")
            val  extention = string[1]

            println(getEmail)
            println(getPassword)

            auth.signInWithEmailAndPassword(getEmail,getPassword)
                .addOnCompleteListener(this) { task ->
                    if(extention.equals("myuct.ac.za")) {
                        Toast.makeText(this, "attempting to sign-in", Toast.LENGTH_SHORT)
                            .show()

                        if (task.isSuccessful) {
                            // Login successful, user is signed in
                            val logInIntent = Intent(this, VendorActivity::class.java)
                            startActivity(logInIntent)
                            val user = auth.currentUser
                            // Proceed with Firestore data access or other actions
                        } else {
                            // Login failed, handle the error
                           /* Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT)
                                .show()*/
                            Log.w(TAG, "signInWithEmail:failure", task.exception)
                            Toast.makeText(baseContext,"Authentication failed.",Toast.LENGTH_SHORT,).show()
                        }

                    }else{
                        Toast.makeText(this, "please enter UCT email", Toast.LENGTH_SHORT).show()
                    }
                }

        }
    }
    /* private fun performSignIn(){
         auth = FirebaseAuth.getInstance()
         val email: EditText = findViewById(R.id.EmailAddress)
         val password: EditText = findViewById(R.id.password)
         if(email.text.isEmpty() || password.text.isEmpty()){
             Toast.makeText(this,"please enter all the required filled", Toast.LENGTH_SHORT).show()
         }
         val getEmail = email.text.toString()
         val getPassword = password.text.toString()

         auth.signInWithEmailAndPassword(getEmail , getPassword)
             .addOnCompleteListener(this) { task ->
                 if (task.isSuccessful) {
                     // Login successful, user is signed in
                     val user = auth.currentUser
                     // Proceed with Firestore data access or other actions
                 } else {
                     // Login failed, handle the error
                     Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show()
                 }
             }
     }*/
}