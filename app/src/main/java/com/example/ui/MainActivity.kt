package com.example.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.layout)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val vakalar = listOf(
            Vaka(1, "Apandisit", "Akut karın ağrısı vakası"),
            Vaka(2, "Kırık", "Sağ kol kırığı"),
            Vaka(3, "Grip", "Yüksek ateş ve öksürük")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VakalarAdapter(vakalar)
    }
}