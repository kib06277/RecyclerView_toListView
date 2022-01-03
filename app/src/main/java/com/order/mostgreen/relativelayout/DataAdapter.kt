package com.order.mostgreen.relativelayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(private val mData: List<String>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataView.text = mData[position]
        holder.itemView.setOnClickListener { Toast.makeText(it.context, "Item $position is clicked.", Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnLongClickListener {
            Toast.makeText(it.context, "Item $position is long clicked.", Toast.LENGTH_SHORT).show()
            true
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }
}

class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val dataView: TextView = v.findViewById(R.id.info_text)
}