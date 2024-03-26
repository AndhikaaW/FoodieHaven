package com.example.foodiehaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.database.Menu
import com.example.foodiehaven.database.MenuApp
import com.example.foodiehaven.database.MenuDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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