package com.example.foodiehaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.adapter.CartViewAdapter
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.AdminApp
import com.example.foodiehaven.database.AdminDao
import com.example.foodiehaven.database.MenuDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Objects

class Cart : AppCompatActivity() {
    lateinit var cartViewAdapter: CartViewAdapter
    lateinit var dao: AdminDao
    lateinit var btnKirim:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        btnKirim = findViewById(R.id.tombolKirim)

        dao = AdminApp.invoke(this@Cart).getAdminDao()
        setupRecycleView()

        btnKirim.setOnClickListener {

        }
    }
    override fun onStart() {
        super.onStart()
        loadDataadmin()
    }
    fun loadDataadmin (){
        CoroutineScope(Dispatchers.Main).launch {
            val admin = dao.getAllAdmin()
            Log.d("MainActivity", "dbResponse: $admin")
            withContext(Dispatchers.Main) {
                cartViewAdapter.setData(admin)
            }
        }
    }
    fun setupRecycleView() {
        val list: RecyclerView? = findViewById(R.id.listViewKeranjang)
        cartViewAdapter = CartViewAdapter(this@Cart,arrayListOf(),object : CartViewAdapter.OnAdapterListener{

            override fun onDeletecart(cartlist: Admin) {
                CoroutineScope(Dispatchers.Main).launch {
                    dao.deleteAdmin(cartlist)
                    withContext(Dispatchers.Main) {
                        loadDataadmin()
                    }
                }
            }

        })
        list?.apply {
            layoutManager = LinearLayoutManager(this@Cart)
            adapter = cartViewAdapter
        }
    }
}