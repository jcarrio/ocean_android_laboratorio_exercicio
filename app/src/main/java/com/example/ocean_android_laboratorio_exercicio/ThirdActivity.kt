package com.example.ocean_android_laboratorio_exercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val tvTerceiraTela = findViewById<TextView>(R.id.tvTerceiraTela)

        // Original para null: tvTerceiraTela.text = intent.getStringExtra("EXTRA_INFO") ?: getString(R.string.tvTextTerceira)

        val extraInfo = intent.getStringExtra("EXTRA_INFO")

        // Original para empty: tvTerceiraTela.text = if (extraInfo != "") extraInfo else getString(R.string.tvTextTerceira)
        tvTerceiraTela.text = if (extraInfo != "") extraInfo else getString(R.string.tvTextTerceira)
    }
}