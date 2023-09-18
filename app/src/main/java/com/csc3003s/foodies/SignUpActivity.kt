package com.csc3003s.foodies

import android.util.Log
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.FirebaseFirestoreKtxRegistrar

class SignUpActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

         // Defining variables
         var email: TextView = findViewById<TextView>(R.id.editTextTextEmailAddress)
         var password: TextView = findViewById<TextView>(R.id.editTextTextPassword)
         var button: Button = findViewById<Button>(R.id.submitup)


        // set on click listener
        button.setOnClickListener(){
            var getEmail = email.text.toString()
            var getPassword = password.text.toString()


            // check if email is empty
            if(getEmail.isEmpty()){
                Toast.makeText(applicationContext, "Enter Email", Toast.LENGTH_LONG).show()
            }
            // check if password is empty
            if(getPassword.isEmpty()){
                Toast.makeText(applicationContext, "Enter Password", Toast.LENGTH_LONG).show()
            }

            //check if user has entered both email and password
            if(getEmail.isNotEmpty() and getPassword.isNotEmpty()){
                // add user to the database
                saveToDataBase(getEmail, getPassword)
                // start Vendor Option activity
                val logInIntent = Intent(this, VendorActivity::class.java)
                startActivity(logInIntent)
            }
        }

    }
    private fun saveToDataBase(UserEmail:String, UserPassword:String){
        //val db = FirebaseFirestoreKtxRegistrar().getInstance()
        val db = FirebaseFirestore.getInstance()
        var user: MutableMap<String, Any> = HashMap()

        user["Email"] = UserEmail
        user["Password"] = UserPassword
        db.collection("customers")
            .add(user).addOnSuccessListener {
                Toast.makeText(this@SignUpActivity, "successfully saved", Toast.LENGTH_LONG)
                    .show()
            }.addOnFailureListener {
                Toast.makeText(this@SignUpActivity, "Failed to save", Toast.LENGTH_LONG).show()
            }
    }
}