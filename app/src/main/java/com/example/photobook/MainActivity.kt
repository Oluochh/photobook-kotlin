package com.example.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnstart=findViewById<Button>(R.id.btnstart)
        btnstart.setOnClickListener {
            var intent=Intent(baseContext,Pic2::class.java)
            startActivity(intent)
        }
    }
}