package com.example.foodiehaven.adapter

import android.content.Context
import android.text.method.TextKeyListener.clear
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.R
import com.example.foodiehaven.database.Admin
import com.example.foodiehaven.database.Historydb

class HistoryAdapter(private val context: Context, private val history: ArrayList<Historydb>):RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>(){
    class HistoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val namaPelanggan: TextView = view.findViewById(R.id.namaPelanggan)
        val tanggalPesan: TextView = view.findViewById(R.id.tanggalPesan)
        val alamatPelanggan: TextView = view.findViewById(R.id.alamatPelanggan)
        val noTelpPelanggan: TextView = view.findViewById(R.id.noTelpPelanggan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_history, parent, false)
        )
    }

    override fun getItemCount() = history.size

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val hist = history[position]
        holder.namaPelanggan.text = hist.namaPelanggan
        holder.tanggalPesan.text = hist.tanggalPesan
        holder.alamatPelanggan.text = hist.alamatPelanggan
        holder.noTelpPelanggan.text = hist.noTelpPelanggan
    }
    fun setData(list: List<Historydb>){
        history.clear()
        history.addAll(list)
        notifyDataSetChanged()
    }
}