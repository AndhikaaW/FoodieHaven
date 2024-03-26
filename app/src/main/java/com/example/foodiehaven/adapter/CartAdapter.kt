package com.example.foodiehaven.adapter

import android.content.Context
import android.content.Intent
import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.OrderView
import com.example.foodiehaven.R
import com.example.foodiehaven.database.Menu

class CartAdapter(private val context: Context, private val menu: ArrayList<Menu>, private val listener: OnAdapterListener) : RecyclerView.Adapter<CartAdapter.CartViewHolder>(){
    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val pelanggan: TextView = view.findViewById(R.id.pelanggan)
        val telepon: TextView = view.findViewById(R.id.telepon)
        val icon_delete: ImageView = view.findViewById(R.id.icon_delete)
        val icon_done: ImageView = view.findViewById(R.id.icon_done)
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
        holder.pelanggan.setOnClickListener {
            listener.onClick(cart)
            val intent = Intent(context, OrderView::class.java)

            intent.putExtra("namaPelanggan", menu[position].namaPelanggan)
            intent.putExtra("alamatRumah", menu[position].alamatRumah)
            intent.putExtra("noTelepon", menu[position].noTelepon)
            context.startActivity(intent)
        }
        holder.telepon.text = cart.noTelepon
        holder.icon_delete
        holder.icon_delete.setOnClickListener {
            listener.onDelete(cart)
        }
        holder.icon_done
    }
    fun setData(list: List<Menu>){
        menu.clear()
        menu.addAll(list)
        notifyDataSetChanged()
    }
    interface OnAdapterListener{
        fun onClick(cart : Menu)
        fun onDelete(cart: Menu)
    }
}