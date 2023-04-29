package com.example.meme_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnButton=findViewById(R.id.btnbutton)
        btnButton.setOnClickListener {
            val forward = Intent(this,Activity2::class.java)
            startActivity(forward)
        }
    }
}
