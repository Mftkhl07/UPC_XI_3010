package com.example.upc_informasi_sayuran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val terong = findViewById<ImageView>(R.id.terong)
        terong.setOnClickListener {
            val intent = Intent(this, Activity_Terong::class.java)
            startActivity(intent)
        }
        val wortel = findViewById<ImageView>(R.id.wortel)
        wortel.setOnClickListener {
            val intent = Intent(this, Activity_Wortel::class.java)
            startActivity(intent)
        }
        val selada = findViewById<ImageView>(R.id.selada)
        selada.setOnClickListener {
            val intent = Intent(this, Activity_Selada::class.java)
            startActivity(intent)
        }
        val tomat = findViewById<ImageView>(R.id.tomat)
        tomat.setOnClickListener {
            val intent = Intent(this, Activity_Tomat::class.java)
            startActivity(intent)
        }
        val cabai = findViewById<ImageView>(R.id.cabai)
        cabai.setOnClickListener {
            val intent = Intent(this, Activity_Cabai::class.java)
            startActivity(intent)
        }
        val bawang = findViewById<ImageView>(R.id.bawang)
        bawang.setOnClickListener {
            val intent = Intent(this, Activity_Bawang::class.java)
            startActivity(intent)
        }
    }

}
