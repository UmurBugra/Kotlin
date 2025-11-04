package com.example.ui

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.ui.ui.theme.VakaListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        // "Vakalar" butonunu
        val btnVakalar = findViewById<Button>(R.id.nav_vakalar)

        // Butona tıklandığında Fragment'ı yükle
        btnVakalar.setOnClickListener {
            supportFragmentManager.beginTransaction()  // fragment işlemi başlatıyor
                // fragment_container içine VakaListFragment'ı yerleştiriyor
                .replace(R.id.fragment_container, VakaListFragment())
                .addToBackStack(null)  // Geri tuşu ile dönebilmek için
                .commit()
        }
    }
}