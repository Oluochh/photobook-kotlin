package com.example.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pic4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic4)
        var btnnext4=findViewById<Button>(R.id.btnnext4)

        btnnext4.setOnClickListener {
            var intent=Intent(baseContext,Pic5::class.java)
            startActivity(intent)
        }
    }
}