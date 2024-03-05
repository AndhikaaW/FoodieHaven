package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var textResgist: TextView
    lateinit var email: EditText
    lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.btn_login)
        email = findViewById(R.id.input_email)
        password = findViewById(R.id.input_password)
        textResgist = findViewById(R.id.text_regist)

        btnLogin.setOnClickListener {
            if(email.text.isNotEmpty() && password.text.isNotEmpty()){
                prosesLogin()
            }else{
                Toast.makeText(this,"Email dan Password tidak boleh kosong" , Toast.LENGTH_SHORT).show()
            }
        }
        textResgist.setOnClickListener {
            startActivity(Intent(this, register::class.java))
            finish()
        }
    }

    private fun prosesLogin(){
        val editemail = email.text.toString()
        val editpassword = password.text.toString()
    }
}