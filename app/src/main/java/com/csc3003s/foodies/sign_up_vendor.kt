package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

class sign_up_vendor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_vendor)
        var storeName: TextView = findViewById<TextView>(R.id.storeName)
        var password: TextView = findViewById<TextView>(R.id.vendorPassword)
        var button: Button = findViewById<Button>(R.id.vendorButton)

        button.setOnClickListener(){
            var store = storeName.text.toString()
            var vendorPassword = password.text.toString()


            // check if email is empty
            if(store.isEmpty()){
                Toast.makeText(applicationContext, "Enter Email", Toast.LENGTH_LONG).show()
            }
            // check if password is empty
            if(vendorPassword.isEmpty()){
                Toast.makeText(applicationContext, "Enter Password", Toast.LENGTH_LONG).show()
            }

            //check if user has entered both email and password
            if(store.isNotEmpty() and vendorPassword.isNotEmpty()){
                // add user to the database
                saveToDataBase(store, vendorPassword)
                // start Vendor Option activity
                val logInIntent = Intent(this, VendorActivity::class.java)
                Toast.makeText(applicationContext, "signed up successfully", Toast.LENGTH_LONG).show()
                startActivity(logInIntent)
            }
        }

    }
    private fun saveToDataBase(storeName:String, VendorPassword:String){
        //val db = FirebaseFirestoreKtxRegistrar().getInstance()
        val db = FirebaseFirestore.getInstance()
        var vendor: MutableMap<String, Any> = HashMap()

        vendor["store"] = storeName
        vendor["Password"] = VendorPassword
        db.collection("Vendors")
            .add(vendor).addOnSuccessListener {
                Toast.makeText(this, "successfully saved", Toast.LENGTH_LONG)
                    .show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed to save", Toast.LENGTH_LONG).show()
            }
    }
}