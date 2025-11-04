package com.example.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VakalarAdapter(
    private val vakalar: List<Vaka>
) : RecyclerView.Adapter<VakaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VakaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_vaka, parent, false)
        return VakaViewHolder(view)
    }

    override fun onBindViewHolder(holder: VakaViewHolder, position: Int) {
        holder.bind(vakalar[position])
    }

    override fun getItemCount(): Int = vakalar.size
}