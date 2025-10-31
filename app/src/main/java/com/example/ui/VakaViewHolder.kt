package com.example.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VakaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val vakaTitle: TextView = itemView.findViewById(R.id.vaka_title)
    private val vakaDescription: TextView = itemView.findViewById(R.id.vaka_description)

    fun bind(vaka: Vaka) {
        vakaTitle.text = vaka.baslik
        vakaDescription.text = vaka.aciklama
    }
}