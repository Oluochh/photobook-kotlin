package com.example.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pic2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic2)
        var btnback2=findViewById<Button>(R.id.btnback2)
        var btnnext2=findViewById<Button>(R.id.btnnext2)

        btnback2.setOnClickListener {
            var intent=Intent(baseContext,Pic2::class.java)
            startActivity(intent)
        }
        btnnext2.setOnClickListener {
            var intent=Intent(baseContext,Pic3::class.java)
            startActivity(intent)
        }

    }
}