package com.example.foodiehaven.adapter

import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.R
import com.example.foodiehaven.database.Menu

class CartAdapter(private val menu: ArrayList<Menu>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>(){
    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val pelanggan: TextView = view.findViewById(R.id.pelanggan)
        val telepon: TextView = view.findViewById(R.id.telepon)
        val icon_delete: ImageView = view.findViewById(R.id.icon_delete)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        return CartViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_cart, parent, false)
        )
    }
    override fun getItemCount() = menu.size

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val cart = menu[position]
        holder.pelanggan.text = cart.namaPelanggan
//        holder.pelanggan.setOnClickListener {
//            listener.onClick(cart)
//        }
        holder.telepon.text = cart.noTelepon
        holder.icon_delete

    }
    fun setData(list: List<Menu>){
        menu.clear()
        menu.addAll(list)
        notifyDataSetChanged()
    }
    interface OnAdapterListener{
        fun onClick(cart : Menu)
    }
}