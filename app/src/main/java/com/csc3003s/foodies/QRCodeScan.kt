package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class QRCodeScan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode_scan)


        ///

        var accessToReview = findViewById<Button>(R.id.submitQR)
        accessToReview.setOnClickListener(){
            var ratingScreen = Intent(this,ReviewPage::class.java)
            startActivity(ratingScreen)

        }
    }

}