package com.example.meme_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity5 : AppCompatActivity() {
//    lateinit var button8: Button
    lateinit var button7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)
//        button8=findViewById(R.id.button8)
        button7=findViewById(R.id.button7)

//        button8.setOnClickListener {
//            val forward = Intent(this,MainActivity::class.java)
//            startActivity(forward)
//        }
        button7.setOnClickListener {
            val forward = Intent(this,Activity4::class.java)
            startActivity(forward)
        }

    }
}
