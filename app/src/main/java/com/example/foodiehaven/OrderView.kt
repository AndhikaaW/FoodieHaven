package com.example.foodiehaven

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.foodiehaven.database.Menu

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
}