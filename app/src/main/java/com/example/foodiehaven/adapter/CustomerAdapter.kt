package com.example.foodiehaven.adapter

import android.content.Context
import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.R
import com.example.foodiehaven.database.Customer
import com.example.foodiehaven.database.Menu

class CustomerAdapter(private val context: Context, private val listpesanan: ArrayList<Menu>): RecyclerView.Adapter<CustomerAdapter.CustomerListViewHolder>(){

    class CustomerListViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val menuPesanan: TextView = view.findViewById(R.id.menuPesanan)
        val hargaPesanan: TextView = view.findViewById(R.id.hargaPesanan)
        val jumlahPesanan: TextView = view.findViewById(R.id.jumlahPesanan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerListViewHolder {
        return CustomerListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_customer, parent, false)
        )
    }

    override fun getItemCount() = listpesanan.size

    override fun onBindViewHolder(holder: CustomerListViewHolder, position: Int) {
        val pesananlist = listpesanan[position]
        holder.menuPesanan.text = pesananlist.namamenu
        holder.hargaPesanan.text = pesananlist.hargamenu
        holder.jumlahPesanan.text = pesananlist.count
    }
    fun setData(list: List<Menu>){
        listpesanan.clear()
        listpesanan.addAll(list)
        notifyDataSetChanged()
    }
}