package com.example.photobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pic3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic3)
        var btnnext3=findViewById<Button>(R.id.btnnext3)
        var btnback3=findViewById<Button>(R.id.btnback3)


        btnnext3.setOnClickListener {
            var intent=Intent(baseContext,Pic4::class.java)
            startActivity(intent)
        }
        btnback3.setOnClickListener {
            var intent=Intent(baseContext,Pic3::class.java)
            startActivity(intent)
        }

    }
}