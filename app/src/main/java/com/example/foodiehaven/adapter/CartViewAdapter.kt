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
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.Menu

class CartViewAdapter (private val context: Context, private val listmenu: ArrayList<Admin>,private val listener: OnAdapterListener) : RecyclerView.Adapter<CartViewAdapter.CartlistViewHolder>(){
    class CartlistViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val menu: TextView = view.findViewById(R.id.menu)
        val harga: TextView = view.findViewById(R.id.harga)
        val jumlah: TextView = view.findViewById(R.id.jumlah)
        val icon_delete: ImageView = view.findViewById(R.id.icon_delete)
//        val icon_done: ImageView = view.findViewById(R.id.icon_done)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartlistViewHolder {
        return CartlistViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_list_cart, parent, false)
        )
    }

    override fun getItemCount() = listmenu.size

    override fun onBindViewHolder(holder: CartlistViewHolder, position: Int) {
        val cartlist = listmenu[position]
        holder.menu.text = cartlist.namamenu
        holder.harga.text = cartlist.hargamenu
        holder.jumlah.text = cartlist.count
        holder.icon_delete.setOnClickListener {
            listener.onDeletecart(cartlist)
        }
    }
    fun setData(list: List<Admin>){
        listmenu.clear()
        listmenu.addAll(list)
        notifyDataSetChanged()
    }
    interface OnAdapterListener{
        fun onDeletecart(cartlist: Admin)
    }
}