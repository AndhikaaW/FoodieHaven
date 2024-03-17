package com.example.foodiehaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.adapter.MenuAdapter
import com.example.foodiehaven.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        replacefragment(Home())
//        binding.bottomNavigationView.setOnItemSelectedListener {
//            when(it.itemId){
//                R.id.home -> replacefragment(Home())
//                R.id.process -> replacefragment(OnProcess())
//                R.id.history -> replacefragment(History())
//
//                else ->{}
//            }
//            true
//        }
        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init(){
        recyclerView = findViewById(R.id.menuPaket)

        var data = arrayListOf<MenuAdapter.MenuMakanan>()
        data.add(MenuAdapter.MenuMakanan(R.drawable.logo,"Nasi Box"))
        data.add(MenuAdapter.MenuMakanan(R.drawable.logo,"Cookies"))
        data.add(MenuAdapter.MenuMakanan(R.drawable.logo,"Kue Basah"))

        adapter = MenuAdapter(data)
    }
//    private fun replacefragment(fragment: Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(
//            R.id.frame_layout, fragment
//        )
//        fragmentTransaction.commit()
//    }
}