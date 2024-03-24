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
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasiboxayam,"Nasi Box Ayam","20.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasiboxikan,"Nasi Box Ikan","20.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasiboxdaging,"Nasi Box Daging","20.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasikuning,"Nasi Kuning","20.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasibesek,"Nasi Besek","20.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nasigeprek,"Nasi Geprek","20.000"))

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
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.logo,"Nastar","10.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.logo,"Kastengel","10.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.sagukeju,"Sagu Keju","10.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kuesemprit,"Kue Sumprit","10.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.putrisalju,"Putri Salju","10.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.logo,"Coklat Meses","10.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.coklatmede,"Coklat Mede","10.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kuekacang,"Kue Kacang","10.000"))

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
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.putuayu,"Putu Ayu","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.lumpurlapindo,"Lumpur Lapindo","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.nagasari,"Nagasari","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.bolukukus,"Bolu Kukus","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.piebuah,"Pie Buah","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kuelumpur,"Kue Lumpur","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.risolmayo,"Risol Mayo","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kue_ku,"Kue Ku","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.dadargulung,"Dadar Gulung","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.sosissolo,"Sosis Solo","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.klepon,"Klepon","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.ondeonde,"Onde - Onde","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.putrimandi,"Putri Mandi","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.kroket,"Kroket","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.rotigulung,"Roti Gulung","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.pastel,"Pastel","5.000"))
        data.add(OrderAdapter.ListMenuMakanan(R.drawable.terangbulan,"Terang Bulan","5.000"))

        adapter = OrderAdapter(this,data, object : OrderAdapter.OnClickListener {
            override fun onItemClick(position: Int) {
                val namaMenu = data[position].listMenu
                Toast.makeText(this@Order, "Anda memilih $namaMenu", Toast.LENGTH_SHORT).show()
            }
        })
    }
}