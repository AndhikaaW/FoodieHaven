package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import com.example.foodiehaven.database.Menu
import com.example.foodiehaven.database.MenuApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OrderAct : AppCompatActivity() {
    lateinit var btnPesan: Button
    lateinit var Count: EditText
    lateinit var Plus: CardView
    lateinit var Min: CardView
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_act)

        Plus = findViewById(R.id.imgAdd)
        Min = findViewById(R.id.imgMinus)
        btnPesan = findViewById(R.id.btnPesan)
        Count = findViewById(R.id.countPaket)

        Plus.setOnClickListener {
            count +=1
            Count.setText(Integer.toString(count))
        }

        Min.setOnClickListener {
            if (count == 0) {
                count = 0
            } else {
                count -= 1
            }
            Count.setText(Integer.toString(count))
        }

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
            val pelanggan = findViewById<TextView>(R.id.input_pelanggan)
            val telepon = findViewById<TextView>(R.id.input_telepon)
            if(pelanggan.text.isNotEmpty() && telepon.text.isNotEmpty()){
                inputData()
                val showDialog = AlertDialog.Builder(this)
                showDialog.setMessage("Success!")
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this,"input tidak boleh kosong" , Toast.LENGTH_SHORT).show()
            }
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