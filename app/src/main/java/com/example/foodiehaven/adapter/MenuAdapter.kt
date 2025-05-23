package com.example.foodiehaven.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.Order
import com.example.foodiehaven.R

class MenuAdapter (private val context: Context, private val data: ArrayList<MenuMakanan>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(inflater: LayoutInflater,parent:ViewGroup): RecyclerView.ViewHolder(inflater.inflate(
        R.layout.adapter_menu,parent,false)){

        private var namaPaket: TextView? = null
        private var paketIcon: ImageView? = null

        init {
            namaPaket = itemView.findViewById(R.id.namaPaket)
            paketIcon = itemView.findViewById(R.id.paketIcon)
        }
        fun bind(data: MenuMakanan){
            namaPaket?.text = data.namaPaket
            paketIcon?.setImageResource(data.paketIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MenuViewHolder(inflater,parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(data[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, Order::class.java)

            intent.putExtra("namaPaket", data[position].namaPaket)
            context.startActivity(intent)
        }
    }

    data class MenuMakanan(val paketIcon: Int, val namaPaket: String)
}