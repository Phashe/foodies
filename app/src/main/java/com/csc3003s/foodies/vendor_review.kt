package com.csc3003s.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class vendor_review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vendor_review)

        var ivCheckReviews = findViewById<ImageView>(R.id.check_review)
        ivCheckReviews.setOnClickListener(){
            var checkReviewIntent = Intent(this,venda_Reviews::class.java)
            startActivity(checkReviewIntent)
        }
    }
}