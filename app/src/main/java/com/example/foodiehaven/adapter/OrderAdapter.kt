import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodiehaven.Cart
import com.example.foodiehaven.MainActivity
import com.example.foodiehaven.OrderAct
import com.example.foodiehaven.R
import com.example.foodiehaven.database.Admin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class OrderAdapter (private val context: Context, private val data: ArrayList<ListMenuMakanan>,private val listener: OnClickListener) : RecyclerView.Adapter<OrderAdapter.ListMenuViewHolder>() {
    class ListMenuViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(
        inflater.inflate(
            R.layout.adapter_list_menu, parent, false
        )
    ) {

        private var listIcon: ImageView? = null
        private var listMenu: TextView? = null
        private var listHarga: TextView? = null

        init {
            listIcon = itemView.findViewById(R.id.listIcon)
            listMenu = itemView.findViewById(R.id.listMenu)
            listHarga = itemView.findViewById(R.id.listHarga)

        }


        fun bind(data: ListMenuMakanan, adapter: OrderAdapter) {
            listIcon?.setImageResource(data.listIcon)
            listMenu?.text = data.listMenu
            listHarga?.text = data.listHarga
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMenuViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ListMenuViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ListMenuViewHolder, position: Int) {
        holder.bind(data[position], this)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, OrderAct::class.java)
//            intent.putExtra("listIcon", data[position].listIcon)
            intent.putExtra("listMenu", data[position].listMenu)
            intent.putExtra("listHarga", data[position].listHarga)
            context.startActivity(intent)
        }
    }

    interface OnClickListener {
        fun onItemClick(position: Int)
    }
    data class ListMenuMakanan(val listIcon: Int, val listMenu: String, val listHarga: String)
}
