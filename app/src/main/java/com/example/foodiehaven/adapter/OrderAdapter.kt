import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.OrderAct
import com.example.foodiehaven.R
import com.example.foodiehaven.adapter.CartAdapter
import com.example.foodiehaven.database.Menu
import com.example.foodiehaven.database.Paket

class OrderAdapter(private val data: ArrayList<Paket>, private val listener: OnAdapterListener) : RecyclerView.Adapter<OrderAdapter.ListMenuViewHolder>() {
    class ListMenuViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val listMenu: TextView = view.findViewById(R.id.listMenu)
        val listHarga: TextView = view.findViewById(R.id.listHarga)
        val listJumlah: TextView = view.findViewById(R.id.jumlah)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMenuViewHolder {
        return ListMenuViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_list_menu, parent, false)
        )
    }
    override fun getItemCount(): Int {
        return data.size
    }
    override fun onBindViewHolder(holder: ListMenuViewHolder, position: Int) {
        val pilihan = data[position]
        holder.listMenu.text = pilihan.namaPaket
        holder.listMenu.setOnClickListener {
            listener.onItemClick(pilihan)
        }
        holder.listHarga.text = pilihan.harga
        holder.listJumlah.text = pilihan.jumlah
    }
    fun setData(list: List<Paket>){
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    interface OnAdapterListener {
        fun onItemClick(pilihan : Paket)
    }
}