package com.example.foodiehaven

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.foodiehaven.adapter.HistoryAdapter
import com.example.foodiehaven.database.AdminApp
import com.example.foodiehaven.database.AdminDao
import com.example.foodiehaven.database.Historydb
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileOutputStream
import android.Manifest
import android.content.ContentValues
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.lifecycleScope
import java.io.OutputStream

class History : AppCompatActivity() {
    lateinit var historyAdapter: HistoryAdapter
    lateinit var dao: AdminDao

    companion object {
        private val REQUIRED_PERMISSIONS = arrayOf(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
    }

    private val requestPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            if (permissions.all { it.value }) {
                // All permissions are granted, proceed with the operation
                exportData()
            } else {
                // At least one permission is denied
                Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        dao = AdminApp.invoke(this@History).getAdminDao()
        setupRecycleView()
        val exportButton: Button = findViewById(R.id.btnExport)
        exportButton.setOnClickListener {
            checkAndRequestPermissions()
        }
    }
    private fun checkAndRequestPermissions() {
        val permissionsToRequest = mutableListOf<String>()
        for (permission in REQUIRED_PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                permissionsToRequest.add(permission)
            }
        }
        if (permissionsToRequest.isNotEmpty()) {
            requestPermissionLauncher.launch(permissionsToRequest.toTypedArray())
        } else {
            exportData()
        }
    }
    private fun exportData() {
        Thread {
            val historyList = dao.getHistory()
            val success = exportToExcel(this, historyList)
            runOnUiThread {
                if (success) {
                    Toast.makeText(this, "Data exported successfully", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Failed to export data", Toast.LENGTH_SHORT).show()
                }
            }
        }.start()
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