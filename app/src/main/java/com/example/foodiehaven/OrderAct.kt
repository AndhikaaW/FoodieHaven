package com.example.foodiehaven

import android.content.Intent
import android.icu.number.IntegerWidth
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
    lateinit var totalHarga: TextView
    var count = 0
    var total = 0
    var hargaTotal = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_act)

        Plus = findViewById(R.id.imgAdd)
        Min = findViewById(R.id.imgMinus)
        btnPesan = findViewById(R.id.btnPesan)
        Count = findViewById(R.id.countPaket)
        totalHarga = findViewById(R.id.totalHarga)

        Plus.setOnClickListener {
            count +=1
            Count.setText(Integer.toString(count))
            getTotalHarga()
            totalHarga.text = (count * total).toString()
        }

        Min.setOnClickListener {
            if (count == 0) {
                count = 0
            } else {
                count -= 1
                getTotalHargaInt()
                totalHarga.text = (hargaTotal - total).toString()
            }
            Count.setText(Integer.toString(count))
        }

        totalHarga.text = total.toString()

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
            val alamat = findViewById<TextView>(R.id.input_alamat)
            if(pelanggan.text.isNotEmpty() && telepon.text.isNotEmpty() && alamat.text.isNotEmpty()){
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

    fun getTotalHarga(){
        val harga = findViewById<TextView>(R.id.hargaMenu)
        val hargaTampil = harga.text.toString()
        val HargaInt = hargaTampil.toInt()
        total = HargaInt
    }
    fun getTotalHargaInt(){
        val intHarga = findViewById<TextView>(R.id.totalHarga)
        val intHargaTampil = intHarga.text.toString()
        val intHargaTotal = intHargaTampil.toInt()
        hargaTotal = intHargaTotal
    }
    fun inputData(){
        val pelanggan = findViewById<TextView>(R.id.input_pelanggan)
        val telepon = findViewById<TextView>(R.id.input_telepon)
        val namaMenu = findViewById<TextView>(R.id.namaMenu)
        val harga = findViewById<TextView>(R.id.totalHarga)
        val alamat = findViewById<TextView>(R.id.input_alamat)

        CoroutineScope(Dispatchers.IO).launch {
            MenuApp(this@OrderAct).getMenuDao().addMenu(
                Menu(0,pelanggan.text.toString(),telepon.text.toString(),alamat.text.toString(),namaMenu.text.toString(),count.toString(),harga.text.toString())
            )
        }
    }
}