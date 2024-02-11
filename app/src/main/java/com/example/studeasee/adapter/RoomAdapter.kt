package com.example.studeasee.adapter


import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.RecyclerView
import com.example.studeasee.R
import com.example.studeasee.model.Room
import com.example.studeasee.ui.RoomDetailsActivity


class RoomAdapter(
    private val context: Context,
    private val dataset: List<Room>,
    private var listener: OnItemClickListener? = null
) : RecyclerView.Adapter<RoomAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.room_name)
        val textView2: TextView = view.findViewById(R.id.room_price)
        val imageView: ImageView = view.findViewById(R.id.roomiv)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_room_list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = item.name
        holder.textView2.text = item.price.toString()
        holder.imageView.setImageResource(item.imageResourceID)
        holder.imageView.setOnClickListener {
            if (position != RecyclerView.NO_POSITION && listener != null) {
                listener!!.onItemClick()
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick()
    }

    fun setOnItemClickListener(listener: OnItemClickListener?) {
        this.listener = listener
    }

}
