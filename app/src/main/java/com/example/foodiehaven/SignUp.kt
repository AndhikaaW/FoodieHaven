package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.AdminApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SignUp : AppCompatActivity() {
    lateinit var btn_SignIn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        btn_SignIn = findViewById(R.id.btn_sign_in)

        btn_SignIn.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }
        setupListener()
    }
    fun inputData() {
        val email = findViewById<EditText>(R.id.input_email)
        val username = findViewById<EditText>(R.id.input_username)
        val password = findViewById<EditText>(R.id.input_password)
        CoroutineScope(Dispatchers.IO).launch {
            AdminApp(this@SignUp).getAdminDao().addAdmin(
                Admin(0, email.text.toString(), username.text.toString(), password.text.toString())
            )
        }
    }

    fun setupListener(){
        val btn: Button = findViewById(R.id.btn_sign_in)
        val email = findViewById<EditText>(R.id.input_email)
        val username = findViewById<EditText>(R.id.input_username)
        val password = findViewById<EditText>(R.id.input_password)
        btn.setOnClickListener {
            if(email.text.isNotEmpty() && username.text.isNotEmpty() && password.text.isNotEmpty()){
                inputData()
                val showDialog = AlertDialog.Builder(this)
                showDialog.setMessage("Success!")
                showDialog.setPositiveButton("OK") { dialog, id ->
                    startActivity(Intent(this, Login::class.java))
                    finish()
                }
                showDialog.show()
            }else{
                Toast.makeText(this,"input tidak boleh kosong" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}