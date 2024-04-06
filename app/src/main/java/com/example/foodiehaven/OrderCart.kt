package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.AdminApp
import com.example.foodiehaven.database.Menu
import com.example.foodiehaven.database.MenuApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OrderCart : AppCompatActivity() {
    lateinit var btnTambahPesanan: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_cart)
        btnTambahPesanan = findViewById(R.id.tambahPesanan)
        btnTambahPesanan.setOnClickListener {
            inputData()
            startActivity(Intent(this@OrderCart, MainActivity::class.java))
        }
    }
    fun inputData(){
        val namaPelanggan = findViewById<TextView>(R.id.input_pelanggan)
        val noTelepon = findViewById<TextView>(R.id.input_telepon)
        val alamat = findViewById<TextView>(R.id.input_alamat)

        CoroutineScope(Dispatchers.IO).launch {
            AdminApp(this@OrderCart).getAdminDao().addAdmin(
                Admin(0,namaPelanggan.text.toString(),noTelepon.text.toString(),alamat.text.toString())
            )
        }
    }
}