package com.example.foodiehaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.adapter.HistoryAdapter
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.AdminApp
import com.example.foodiehaven.database.AdminDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class History : AppCompatActivity() {
    lateinit var historyAdapter: HistoryAdapter
    lateinit var dao: AdminDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        dao = AdminApp.invoke(this@History).getAdminDao()
        setupRecycleView()
    }
    override fun onStart() {
        super.onStart()
        loadData()
    }
    fun loadData (){
        CoroutineScope(Dispatchers.Main).launch {
            val hist = dao.getAllHistory()
            Log.d("History", "dbResponse: $hist")
            withContext(Dispatchers.Main) {
                historyAdapter.setData(hist)
            }
        }
    }
    fun setupRecycleView(){

        val list: RecyclerView? = findViewById(R.id.recycleViewHistory)

        historyAdapter = HistoryAdapter(this, arrayListOf())

        list?.apply {
            layoutManager = LinearLayoutManager(this@History)
            adapter = historyAdapter
        }
    }
}