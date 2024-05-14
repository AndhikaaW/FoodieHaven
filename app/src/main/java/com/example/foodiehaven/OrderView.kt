package com.example.foodiehaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrderView : AppCompatActivity() {
//    lateinit var dao: MenuDao
//    lateinit var cartAdapter: CartAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_view)
        val intent = intent

        val Nama = intent.getStringExtra("namaPelanggan")
        val NoTelepon = intent.getStringExtra("noTelepon")
        val Alamat = intent.getStringExtra("alamatRumah")

        val nama = findViewById<TextView>(R.id.Nama)
        val noTelepon = findViewById<TextView>(R.id.NoTelepon)
        val alamat = findViewById<TextView>(R.id.Alamat)

        nama.text = Nama
        noTelepon.text = NoTelepon
        alamat.text = Alamat
    }

//    fun tampilData(){
//
//    }
}