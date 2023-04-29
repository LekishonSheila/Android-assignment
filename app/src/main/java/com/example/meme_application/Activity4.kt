package com.example.meme_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity4 : AppCompatActivity() {
    lateinit var button6: Button
    lateinit var button5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        button6=findViewById(R.id.button6)
        button5=findViewById(R.id.button5)

        button6.setOnClickListener {
            val forward = Intent(this,Activity5::class.java)
            startActivity(forward)
        }
        button6.setOnClickListener{
            val forward = Intent(this,Activity3::class.java)
            startActivity(forward)
        }
    }
}