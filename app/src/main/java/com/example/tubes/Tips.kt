package com.example.tubes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)
        var txt_tips: TextView = findViewById(R.id.textView9)
        val txt_judul: TextView = findViewById(R.id.textView4)
        val tampil = intent.extras?.getString("TIPS")
        val judul_tampil = intent.extras?.getString("JUDUL_TIPS")

        txt_judul.text = judul_tampil
        txt_tips.text = tampil
    }
}
