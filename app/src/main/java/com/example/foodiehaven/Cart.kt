package com.example.foodiehaven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.adapter.CartViewAdapter
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.AdminApp
import com.example.foodiehaven.database.AdminDao
import com.example.foodiehaven.database.ItemCart
import com.example.foodiehaven.database.Menu
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Calendar
import java.util.Objects

class Cart : AppCompatActivity() {
    lateinit var cartViewAdapter: CartViewAdapter
    lateinit var dao: AdminDao

    lateinit var btnKirim: Button
    lateinit var btnTanggal: ImageView

    lateinit var listbarang: List<Menu>
//    lateinit var harga: TextView
//    var TotalHargaPesanan = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        btnKirim = findViewById(R.id.tombolKirim)
        btnTanggal = findViewById(R.id.btntgl)

        dao = AdminApp.invoke(this@Cart).getAdminDao()
        setupRecycleView()
        btnTanggal.setOnClickListener {
            val tglPesan = findViewById<TextView>(R.id.input_tanggal)

            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val second = calendar.get(Calendar.SECOND)

            val formattedDateTime = String.format("%d-%02d-%02d %02d:%02d:%02d",dayOfMonth ,month ,year , hour,minute,second)
            tglPesan.text = formattedDateTime
        }

        btnKirim.setOnClickListener {
            val namaPelanggan = findViewById<TextView>(R.id.input_pelanggan)
            val noTelepon = findViewById<TextView>(R.id.input_telepon)
            val alamat = findViewById<TextView>(R.id.input_alamat)
            val tglPesan = findViewById<TextView>(R.id.input_tanggal)
//            val bundle = intent.getBundleExtra("dataBundle")
//            if (bundle != null) {
//                val namaMenu = bundle.getString("namaMenu")
//                val hargaMenu = bundle.getString("hargaMenu")
//            }

//            val intent = Intent(this, OrderCart::class.java)
//            intent.putExtra("dataBundle",bundle)
//            startActivity(intent)

//            val bundle = Bundle()
//            val intent = Intent(this, OrderCart::class.java)
//            intent.putExtras(bundle)
//            startActivity(intent)
//            startActivity(Intent(this@Cart,OrderCart::class.java))

            if(namaPelanggan.text.isNotEmpty()){
                if(noTelepon.text.isNotEmpty()){
                    if(alamat.text.isNotEmpty()){
                        if(tglPesan.text.isNotEmpty()){
                            inputData()
                            getLast()

                            startActivity(Intent(this@Cart, MainActivity::class.java))
                        }
                    } else {
                        Toast.makeText(this,"Alamat tidak boleh kosong", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this,"No Telepon tidak boleh kosong", Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(this,"Nama Pelanggan tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
////
    }
    override fun onStart() {
        super.onStart()
        loadDatamenu()
    }
    fun loadDatamenu(){
        CoroutineScope(Dispatchers.Main).launch {
            val menu = dao.getAllMenu()
            listbarang = menu
            Log.d("MainActivity", "dbResponse: $menu")
            withContext(Dispatchers.Main) {
                cartViewAdapter.setData(menu)
            }
        }
    }

    fun inputItem(id:Long,menuId:Menu){
        CoroutineScope(Dispatchers.IO).launch {
            AdminApp(this@Cart).getAdminDao().addItem(
                ItemCart(adminid = id, namamenu = menuId.namamenu, hargamenu = menuId.hargamenu, count = menuId.count))
        }
    }
    fun getLast(){
        var id = 0L
        CoroutineScope(Dispatchers.IO).launch {
            id = AdminApp(this@Cart).getAdminDao().getLastTransaksi()
        }.invokeOnCompletion {
            listbarang.forEach{
            inputItem(id,it)
        }
            deleteMenu()}
    }
    fun deleteMenu(){
        CoroutineScope(Dispatchers.IO).launch {
            AdminApp(this@Cart).getAdminDao().deleteAllMenu()
        }
    }
    fun inputData(){
        val namaPelanggan = findViewById<TextView>(R.id.input_pelanggan)
        val noTelepon = findViewById<TextView>(R.id.input_telepon)
        val alamat = findViewById<TextView>(R.id.input_alamat)
        val tglPesan = findViewById<TextView>(R.id.input_tanggal)

        val admin = Admin(namaPelanggan = namaPelanggan.text.toString(), noTelepon = noTelepon.text.toString(), alamatRumah = alamat.text.toString(), tanggalPesan = tglPesan.text.toString())
        CoroutineScope(Dispatchers.IO).launch {
            AdminApp(this@Cart).getAdminDao().addAdmin(
                admin
            )
        }
    }
    fun setupRecycleView() {
        val list: RecyclerView? = findViewById(R.id.listViewKeranjang)
        cartViewAdapter = CartViewAdapter(this,arrayListOf(),object : CartViewAdapter.OnAdapterListener{
            override fun onDeletecart(cartlist: Menu) {
                CoroutineScope(Dispatchers.Main).launch {
                    dao.deleteMenu(cartlist)
                    withContext(Dispatchers.Main) {
                        loadDatamenu()
                    }

                }
            }

//            override fun onItemSelectionChanged(cartlist: Menu, isSelected: Boolean) {
//                val selectedItems: ArrayList<Menu> = ArrayList()
//
//                if (isSelected) {
//                    selectedItems.add(cartlist)
//                } else {
//                    selectedItems.remove(cartlist)
//                }
//
////                val intent = Intent(this@Cart, OrderCart::class.java)
//
//                if (!isSelected) {
////                    val bundle = Bundle()
////                    bundle.putString("namamenu", cartlist.namamenu)
//////                    bundle.putString("hargaMenu", cartlist.hargamenu)
////                    intent.putExtra("selectedItem", bundle)
////                    startActivity(intent)
//                }
//            }
        })
        list?.apply {
            layoutManager = LinearLayoutManager(this@Cart)
            adapter = cartViewAdapter
        }
    }

}