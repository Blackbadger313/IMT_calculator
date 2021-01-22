package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tmbl_hitung: Button = findViewById(R.id.btn_hitung)
        var bdn_berat: TextView = findViewById(R.id.beratBadan)
        var bdn_tinggi: TextView = findViewById(R.id.tinggiBadan)


        tmbl_hitung.setOnClickListener {
                val tinggi: Float = bdn_tinggi.text.toString().toFloat()/100
                val berat: Float = bdn_berat.text.toString().toFloat()
                val hasil: Float = berat/(tinggi*tinggi)

                var pindah = Intent(this, Result::class.java)
                pindah.putExtra("KEY_RESULT", hasil)
                startActivity(pindah)
        }
    }
}