package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    lateinit var btn_SignIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_SignIn = findViewById(R.id.btn_sign_in)

        btn_SignIn.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }
    }
}