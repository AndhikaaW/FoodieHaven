package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.adapter.MenuAdapter
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.AdminApp
import com.example.foodiehaven.database.AdminDao
import com.example.foodiehaven.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MenuAdapter
    lateinit var dao: AdminDao
    lateinit var cartAdapter: CartAdapter
    lateinit var btnlogout: ImageView
    lateinit var btnHistory: CardView
    lateinit var btnOnProcess:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnlogout = findViewById(R.id.btn_logout)
        recyclerView = findViewById(R.id.menuPaket)
        btnHistory = findViewById(R.id.History)
        btnOnProcess = findViewById(R.id.onprocess)

        dao = AdminApp.invoke(this@MainActivity).getAdminDao()

        init()

        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = adapter

        setupRecycleView()

        btnlogout.setOnClickListener {
            startActivity(Intent(this@MainActivity, Login::class.java))
            finish()
        }
        btnHistory.setOnClickListener{
            startActivity(Intent(this@MainActivity, History::class.java))
        }
        btnOnProcess.setOnClickListener {
            startActivity(Intent(this@MainActivity,Cart::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        loadData()
    }
    fun loadData (){
        CoroutineScope(Dispatchers.Main).launch {
            val admin = dao.getAllAdmin()
            Log.d("MainActivity", "dbResponse: $admin")
            withContext(Dispatchers.Main) {
                cartAdapter.setData(admin)
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

        cartAdapter = CartAdapter(this, arrayListOf(), object : CartAdapter.OnAdapterListener {
            override fun onClick(cart: Admin) {
                Toast.makeText(this@MainActivity, "loading", Toast.LENGTH_SHORT).show()
            }
            override fun onDelete(cart: Admin) {
                CoroutineScope(Dispatchers.Main).launch {
                    dao.deleteAdmin(cart)
                    withContext(Dispatchers.Main) {
                        loadData()
                    }
                }
            }
        })

        list?.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = cartAdapter
        }
    }
}