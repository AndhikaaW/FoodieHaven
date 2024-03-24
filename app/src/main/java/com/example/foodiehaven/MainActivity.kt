package com.example.foodiehaven

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.adapter.MenuAdapter
import com.example.foodiehaven.database.MenuApp
import com.example.foodiehaven.database.MenuDao
import com.example.foodiehaven.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MenuAdapter
    lateinit var dao: MenuDao
    lateinit var cartAdapter: CartAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.menuPaket)

        dao = MenuApp.invoke(this@MainActivity).getMenuDao()

        init()

        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = adapter

        setupRecycleView()
    }

    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            val menu = dao.getAllMenu()
            Log.d("MainActivity", "dbResponse: $menu")
            withContext(Dispatchers.IO) {
                cartAdapter.setData(menu)
            }
        }
    }

    private fun init(){

        var data = arrayListOf<MenuAdapter.MenuMakanan>()
        data.add(MenuAdapter.MenuMakanan(R.drawable.nasiboxayam,"Nasi Box"))
        data.add(MenuAdapter.MenuMakanan(R.drawable.kuekacang,"Cookies"))
        data.add(MenuAdapter.MenuMakanan(R.drawable.terangbulan,"Kue Basah"))

        adapter = MenuAdapter(this,data)

    }
    fun setupRecycleView(){
        val list: RecyclerView? = findViewById(R.id.listKeranjang)
        cartAdapter = CartAdapter(arrayListOf())

        list?.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = cartAdapter
        }
    }
}