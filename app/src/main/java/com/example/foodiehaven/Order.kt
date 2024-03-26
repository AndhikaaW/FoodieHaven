package com.example.foodiehaven

import OrderAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Order : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: OrderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val intent = intent
        val namaPaket = intent.getStringExtra("namaPaket")

        val textView = findViewById<TextView>(R.id.selected)
        textView.text = namaPaket

        when (namaPaket) {
            "Nasi Box" -> paket1()
            "Cookies" -> paket2()
            "Kue Basah" -> paket3()
        }

        recyclerView.layoutManager = GridLayoutManager(this@Order, 2)
        recyclerView.adapter = adapter
    }

    private fun paket1() {
        recyclerView = findViewById(R.id.listPilihanMenu)

        var data = arrayListOf<OrderAdapter.ListMenuMakanan>()
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasiboxayam,"Nasi Box Ayam","20000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasiboxikan,"Nasi Box Ikan","20000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasiboxdaging,"Nasi Box Daging","20000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasikuning,"Nasi Kuning","20000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasibesek,"Nasi Besek","20000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasigeprek,"Nasi Geprek","20000"))

        adapter = OrderAdapter(this, data, object : OrderAdapter.OnClickListener {
            override fun onItemClick(position: Int) {

                val namaMenu = data[position].listMenu
                Toast.makeText(this@Order, "Anda memilih $namaMenu", Toast.LENGTH_SHORT).show()
            }
        })
    }
    private fun paket2(){
        recyclerView = findViewById(R.id.listPilihanMenu)

        var data = arrayListOf<OrderAdapter.ListMenuMakanan>()
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.logo,"Nastar","10000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.logo,"Kastengel","10000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.sagukeju,"Sagu Keju","10000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kuesemprit,"Kue Sumprit","10000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.putrisalju,"Putri Salju","10000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.logo,"Coklat Meses","10000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.coklatmede,"Coklat Mede","10000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kuekacang,"Kue Kacang","10000"))

        adapter = OrderAdapter(this,data, object : OrderAdapter.OnClickListener {
            override fun onItemClick(position: Int) {
                val namaMenu = data[position].listMenu
                Toast.makeText(this@Order, "Anda memilih $namaMenu", Toast.LENGTH_SHORT).show()
            }
        })
    }
    private fun paket3(){
        recyclerView = findViewById(R.id.listPilihanMenu)

        var data = arrayListOf<OrderAdapter.ListMenuMakanan>()
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.putuayu,"Putu Ayu","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.lumpurlapindo,"Lumpur Lapindo","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nagasari,"Nagasari","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.bolukukus,"Bolu Kukus","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.piebuah,"Pie Buah","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kuelumpur,"Kue Lumpur","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.risolmayo,"Risol Mayo","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kue_ku,"Kue Ku","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.dadargulung,"Dadar Gulung","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.sosissolo,"Sosis Solo","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.klepon,"Klepon","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.ondeonde,"Onde - Onde","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.putrimandi,"Putri Mandi","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kroket,"Kroket","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.rotigulung,"Roti Gulung","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.pastel,"Pastel","5000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.terangbulan,"Terang Bulan","5000"))

        adapter = OrderAdapter(this,data, object : OrderAdapter.OnClickListener {
            override fun onItemClick(position: Int) {
                val namaMenu = data[position].listMenu
                Toast.makeText(this@Order, "Anda memilih $namaMenu", Toast.LENGTH_SHORT).show()
            }
        })
    }
}