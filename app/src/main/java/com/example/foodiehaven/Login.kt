package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.findNavController
import com.example.foodiehaven.database.Admin
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
    private lateinit var database: AdminApp


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
            startActivity(Intent(this, register::class.java))
            finish()
        }
    }

    private fun prosesLogin(){
        val username = findViewById<EditText>(R.id.input_username)
        val password = findViewById<EditText>(R.id.input_password)
        val navController = findNavController(R.id.nav_host_fragment)

        CoroutineScope(Dispatchers.IO).launch {
            val admin = AdminApp(this@Login).getAdminDao().findUserByUsernameAndPassword(username.text.toString(),password.text.toString())
            withContext(Dispatchers.Main) {
                if (admin != null && admin.password == password.text.toString()) {
                    navController.navigate(R.id.fragment_home)
                    Toast.makeText(this@Login, "Login berhasil", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@Login, "Username atau password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}