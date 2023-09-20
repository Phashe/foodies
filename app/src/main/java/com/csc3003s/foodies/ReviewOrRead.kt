package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ReviewOrRead : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_or_read)


        var makeAReview = findViewById<ImageView>(R.id.writeReview)
        makeAReview.setOnClickListener(){
            var QRPage = Intent(this,QRCodeScan::class.java)
            startActivity(QRPage)

        }

        var readAReview = findViewById<ImageView>(R.id.readReview)
        readAReview.setOnClickListener(){
            var QRPage = Intent(this,QRCodeScan::class.java)
            startActivity(QRPage)

        }
    }
}