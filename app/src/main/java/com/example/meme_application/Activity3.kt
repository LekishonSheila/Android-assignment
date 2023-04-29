package com.example.meme_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    lateinit var button4: Button
    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        button4=findViewById(R.id.button4)
        button3=findViewById(R.id.button3)

        button4.setOnClickListener {
            val forward = Intent(this,Activity4::class.java)
            startActivity(forward)
        }
        button4.setOnClickListener {
            val forward = Intent(this, Activity2::class.java)
            startActivity(forward)
        }


    }
}