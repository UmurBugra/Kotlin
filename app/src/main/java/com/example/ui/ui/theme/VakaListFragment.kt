package com.example.ui.ui.theme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ui.R
import com.example.ui.Vaka
import com.example.ui.VakalarAdapter

class VakaListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vaka_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // RecyclerView'ı bul
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)

        // Vaka listesini oluştur
        val vakalar = listOf(
            Vaka(1, "Apandisit", "Akut karın ağrısı vakası"),
            Vaka(2, "Kırık", "Sağ kol kırığı"),
            Vaka(3, "Grip", "Yüksek ateş ve öksürük")
        )

        // RecyclerView'ı ayarla
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = VakalarAdapter(vakalar)
    }
}