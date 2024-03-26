package com.example.foodiehaven

import OrderAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.database.Paket
import com.example.foodiehaven.database.PaketApp
import com.example.foodiehaven.database.PaketDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Order : AppCompatActivity() {
//    lateinit var recyclerView: RecyclerView
//    lateinit var dao: PaketDao
    lateinit var btnKirim: Button
    lateinit var adapter: OrderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        btnKirim = findViewById(R.id.btnKirim)

        val intent = intent
        val namaPaket = intent.getStringExtra("namaPaket")
//
        val textView = findViewById<TextView>(R.id.selected)
        textView.text = namaPaket

//        recyclerView.layoutManager = GridLayoutManager(this@Order, 2)
//        recyclerView.adapter = adapter
        btnKirim.setOnClickListener {
            inputData()
        }
//        RecycleView()
    }
    fun inputData(){
        val namaMenu = findViewById<TextView>(R.id.input_menu)
        val harga = findViewById<TextView>(R.id.input_harga)

        CoroutineScope(Dispatchers.IO).launch {
            PaketApp(this@Order).getPaketDao().addPaket(
                Paket(0,namaMenu.text.toString(),harga.text.toString(),"0")
            )
        }
    }
//    override fun onStart() {
//        super.onStart()
//        load()
//        Log.d("onstart", "error : ")
//    }
//    fun load() {
//        CoroutineScope(Dispatchers.Main).launch {
//            val paket = dao.getAllPaket()
//            Log.d("Order", "dbResponse: $paket")
//            withContext(Dispatchers.Main) {
//                adapter.setData(paket)
//            }
//        }
//    }
    fun RecycleView() {
        val list: RecyclerView? = findViewById(R.id.listPilihanMenu)

        adapter = OrderAdapter(arrayListOf(), object : OrderAdapter.OnAdapterListener{
            override fun onItemClick(pilihan: Paket) {
                Toast.makeText(this@Order, "alhamdulillah", Toast.LENGTH_SHORT).show()
            }
        })

        list?.apply {
            layoutManager = LinearLayoutManager(this@Order)
            adapter = adapter
        }
        Log.d("Recycle", "error : ")
    }
}