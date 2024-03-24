package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.foodiehaven.database.Menu
import com.example.foodiehaven.database.MenuApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OrderAct : AppCompatActivity() {
    lateinit var btnPesan: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_act)

        btnPesan = findViewById(R.id.btnPesan)
        
        val intent = intent
//        val Icon = intent.getStringExtra("listIcon")
        val Nama = intent.getStringExtra("listMenu")
        val Harga = intent.getStringExtra("listHarga")

//        val icon = findViewById<TextView>(R.id.iconMenu)
        val nama = findViewById<TextView>(R.id.namaMenu)
        val harga = findViewById<TextView>(R.id.hargaMenu)
//        icon.   = Icon
        nama.text = Nama
        harga.text = Harga
        
        btnPesan.setOnClickListener {
            inputData()
            val showDialog = AlertDialog.Builder(this)
            showDialog.setMessage("Success!")
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    fun inputData(){
        val pelanggan = findViewById<TextView>(R.id.input_pelanggan)
        val telepon = findViewById<TextView>(R.id.input_telepon)
        val namaMenu = findViewById<TextView>(R.id.namaMenu)
        val kuantitas = findViewById<TextView>(R.id.countPaket)
        val harga = findViewById<TextView>(R.id.hargaMenu)
        CoroutineScope(Dispatchers.IO).launch {
            MenuApp(this@OrderAct).getMenuDao().addMenu(
                Menu(0,pelanggan.text.toString(),telepon.text.toString(),namaMenu.text.toString(),kuantitas.text.toString(),harga.text.toString())
            )
        }
    }
}