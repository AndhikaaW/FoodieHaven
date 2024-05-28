package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Login : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var username: EditText
    lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.btn_login)
        username = findViewById(R.id.input_username)
        password = findViewById(R.id.input_password)

        btnLogin.setOnClickListener {
            if(username.text.isNotEmpty() && password.text.isNotEmpty()){
                if (username.text.toString() == "y"){
                    if (password.text.toString() == "y"){
                        startActivity(Intent(this@Login, MainActivity::class.java))
                    } else{
                        Toast.makeText(this,"Password Salah" , Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this,"Username Salah" , Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Email dan Password tidak boleh kosong" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}