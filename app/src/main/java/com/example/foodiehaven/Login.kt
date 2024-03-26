package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.foodiehaven.database.AdminApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Login : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var textResgist: TextView
    lateinit var username: EditText
    lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.btn_login)
        username = findViewById(R.id.input_username)
        password = findViewById(R.id.input_password)
        textResgist = findViewById(R.id.text_regist)

        btnLogin.setOnClickListener {
            if(username.text.isNotEmpty() && password.text.isNotEmpty()){
                prosesLogin()
            }else{
                Toast.makeText(this,"Email dan Password tidak boleh kosong" , Toast.LENGTH_SHORT).show()
            }
        }
        textResgist.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }
    }

    private fun prosesLogin(){
        val username = findViewById<EditText>(R.id.input_username)
        val password = findViewById<EditText>(R.id.input_password)

        CoroutineScope(Dispatchers.IO).launch {
            val admin = AdminApp(this@Login).getAdminDao().findUserByUsernameAndPassword(username.text.toString(),password.text.toString())
            withContext(Dispatchers.Main) {
                if (admin != null && admin.password == password.text.toString()) {
                    val intent = Intent(this@Login, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this@Login, "Username atau password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}