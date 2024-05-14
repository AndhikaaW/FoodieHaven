package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.adapter.CartViewAdapter
import com.example.foodiehaven.database.Menu
import com.example.foodiehaven.database.MenuApp
import com.example.foodiehaven.database.MenuDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Objects

class Cart : AppCompatActivity() {
    lateinit var cartViewAdapter: CartViewAdapter
    lateinit var dao: MenuDao
    lateinit var btnKirim: CardView
//    lateinit var harga: TextView
//    var TotalHargaPesanan = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        btnKirim = findViewById(R.id.tombolKirim)

        dao = MenuApp.invoke(this@Cart).getMenuDao()
        setupRecycleView()

        btnKirim.setOnClickListener {
            startActivity(Intent(this@Cart,OrderCart::class.java))
        }
    }
    override fun onStart() {
        super.onStart()
        loadDatamenu()
    }
    fun loadDatamenu(){
        CoroutineScope(Dispatchers.Main).launch {
            val menu = dao.getAllMenu()
            Log.d("MainActivity", "dbResponse: $menu")
            withContext(Dispatchers.Main) {
                cartViewAdapter.setData(menu)
            }
        }
    }
    fun setupRecycleView() {
        val list: RecyclerView? = findViewById(R.id.listViewKeranjang)
        cartViewAdapter = CartViewAdapter(arrayListOf(),object : CartViewAdapter.OnAdapterListener{
            override fun onPluscart(cartlist: Menu) {

            }

            override fun onDeletecart(cartlist: Menu) {
                CoroutineScope(Dispatchers.Main).launch {
                    dao.deleteMenu(cartlist)
                    withContext(Dispatchers.Main) {
                        loadDatamenu()
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