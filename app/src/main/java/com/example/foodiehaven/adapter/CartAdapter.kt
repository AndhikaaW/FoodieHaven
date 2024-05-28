package com.example.foodiehaven.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.OrderView
import com.example.foodiehaven.R
import com.example.foodiehaven.database.Admin

class CartAdapter(private val context: Context, private val admin: ArrayList<Admin>, private val listener: OnAdapterListener) : RecyclerView.Adapter<CartAdapter.CartViewHolder>(){
    class CartViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val pelanggan: TextView = view.findViewById(R.id.pelanggan)
        val telepon: TextView = view.findViewById(R.id.notelepon)
        val icon_delete: ImageView = view.findViewById(R.id.icon_delete)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        return CartViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_cart_view, parent, false)
        )
    }
    override fun getItemCount() = admin.size

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val cart = admin[position]
        holder.pelanggan.text = cart.namaPelanggan
        holder.itemView.setOnClickListener {
            listener.onClick(cart)
            val intent = Intent(context, OrderView::class.java)
            intent.putExtra("adminid", admin[position].adminid.toString())
            intent.putExtra("namaPelanggan", admin[position].namaPelanggan)
            intent.putExtra("noTelepon", admin[position].noTelepon)
            intent.putExtra("alamatRumah", admin[position].alamatRumah)
            intent.putExtra("tanggalPesan", admin[position].tanggalPesan)
            context.startActivity(intent)
        }
        holder.telepon.text = cart.noTelepon
        holder.icon_delete
        holder.icon_delete.setOnClickListener {
            listener.onDelete(cart)
        }
//        holder.icon_done.setOnClickListener {
//            listener.onClick(cart)
//            val intent = Intent(context, OrderView::class.java)
//
//            intent.putExtra("namaPelanggan", admin[position].namaPelanggan)
//            intent.putExtra("noTelepon", admin[position].noTelepon)
//            intent.putExtra("alamatRumah", admin[position].alamatRumah)
//            intent.putExtra("tanggalPesan", admin[position].tanggalPesan)
//            context.startActivity(intent)
//        }
    }
    fun setData(list: List<Admin>){
        admin.clear()
        admin.addAll(list)
        notifyDataSetChanged()
    }
    interface OnAdapterListener{
        fun onClick(cart : Admin)
        fun onDelete(cart: Admin)
    }
}