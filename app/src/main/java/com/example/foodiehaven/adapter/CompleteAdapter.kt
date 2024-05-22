package com.example.foodiehaven.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.R
import com.example.foodiehaven.database.Admin

class CompleteAdapter(private val admin: ArrayList<Admin>): RecyclerView.Adapter<CompleteAdapter.CompleteViewHolder>(){
    class CompleteViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val pelanggan: TextView = view.findViewById(R.id.pelanggan)
        val telepon: TextView = view.findViewById(R.id.notelepon)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompleteViewHolder {
        return CompleteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_cart_view, parent, false)
        )
    }

    override fun getItemCount() = admin.size
    override fun onBindViewHolder(holder: CompleteViewHolder, position: Int) {
        val cart = admin[position]
        holder.pelanggan.text = cart.namaPelanggan
        holder.telepon.text = cart.noTelepon
    }
}