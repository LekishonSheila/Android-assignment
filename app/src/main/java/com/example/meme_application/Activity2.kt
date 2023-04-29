package com.example.meme_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    lateinit var button:Button
    lateinit var button2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)

        button.setOnClickListener {
            val forward = Intent(this,Activity3::class.java)
            startActivity(forward)
        }
        button2.setOnClickListener {
            val forward = Intent(this, MainActivity::class.java)
            startActivity(forward)
        }



    }
}