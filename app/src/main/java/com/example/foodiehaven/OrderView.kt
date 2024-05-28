package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CustomerAdapter
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.AdminApp
import com.example.foodiehaven.database.AdminDao
import com.example.foodiehaven.database.Historydb
import com.example.foodiehaven.database.Menu
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class OrderView : AppCompatActivity() {
    lateinit var dao: AdminDao
    lateinit var customerAdapter: CustomerAdapter
//    lateinit var recyclerView : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_view)
        val intent = intent

        val id = intent.getStringExtra("adminid")
        val Nama = intent.getStringExtra("namaPelanggan")
        val NoTelepon = intent.getStringExtra("noTelepon")
        val Alamat = intent.getStringExtra("alamatRumah")
        val TglPesan = intent.getStringExtra("tanggalPesan")

        val kodePesanan = findViewById<TextView>(R.id.kodePesanan)
        val nama = findViewById<TextView>(R.id.Nama)
        val noTelepon = findViewById<TextView>(R.id.NoTelepon)
        val alamat = findViewById<TextView>(R.id.Alamat)
        val tglPesan = findViewById<TextView>(R.id.TglPesan)
        val deleteAdmin = findViewById<Button>(R.id.deletePelanggan)


        kodePesanan.text = id
        nama.text = Nama
        noTelepon.text = NoTelepon
        alamat.text = Alamat
        tglPesan.text = TglPesan

        kodePesanan
//        recyclerView = findViewById(R.id.listItemPesanan)

        dao = AdminApp.invoke(this).getAdminDao()

        CoroutineScope(Dispatchers.Default).launch {
            val data = dao.getAllById(id!!.toLong())
            customerAdapter.setData(data)
        }

//        val customer = dao.getMenuByAdmin()
//        customerAdapter = CustomerAdapter(customer.menu)
//        recyclerView.adapter = customerAdapter
//        recyclerView.layoutManager = LinearLayoutManager(this)

//        CoroutineScope(Dispatchers.IO).launch {
//            val customer = dao.getMenuByAdmin()
//
//            CoroutineScope(Dispatchers.Main).launch {
//                customerAdapter = CustomerAdapter(customer.menu)
//                recyclerView.adapter = customerAdapter
//                recyclerView.layoutManager = LinearLayoutManager(this@OrderView)
//            }
//        }

        setupRecycleView()
//
//        val db = AdminApp(this)
//
//        CoroutineScope(Dispatchers.Main).launch {
//            val data = db.getAdminDao().getMenuByAdmin()
//            Log.i("TAG",data.toString())
//        }
        deleteAdmin.setOnClickListener {
            startActivity(Intent(this@OrderView, MainActivity::class.java))
            CoroutineScope(Dispatchers.IO).launch {
                AdminApp(this@OrderView).getAdminDao().addHistory(
                    Historydb(0,nama.text.toString(),tglPesan.text.toString())
                )
            }
            CoroutineScope(Dispatchers.Main).launch {
               dao.delete(nama.text.toString())
            }

            CoroutineScope(Dispatchers.Main).launch {
                dao.delItem(id!!.toLong())
            }
        }
    }
    fun setupRecycleView() {
        val list: RecyclerView? = findViewById(R.id.listItemPesanan)

        customerAdapter = CustomerAdapter(this, ArrayList())

        list?.apply {
            layoutManager = LinearLayoutManager(this@OrderView)
            adapter = customerAdapter
        }
    }
}