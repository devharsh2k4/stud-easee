package com.example.studeasee.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.studeasee.R

class ViewPagerAdapter(
    private val images : List<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>()

{

    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager,parent,false)
        return  ViewPagerViewHolder(View)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage = images[position]
        holder.itemView.findViewById<ImageView>(R.id.ivImage).setImageResource(curImage)
    }

    override fun getItemCount(): Int {
        return  images.size
    }
}