package com.example.ocean_android_laboratorio_exercicio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNome = findViewById<EditText>(R.id.etNome)
        val btExibir = findViewById<Button>(R.id.btExibir)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btSecondActivity = findViewById<Button>(R.id.btSegundaTela)
        val btLigar = findViewById<Button>(R.id.btLigar)

        // Converted from tvResultado.text = getString(R.string.tvTextHello, getString(R.string.txtMundo));
        tvResultado.text = getString(R.string.tvTextHello, getString(R.string.txtMundo));

        btSecondActivity.setOnClickListener {
            val segundaTelaIntent = Intent(this, SecondActivity::class.java)
            startActivity(segundaTelaIntent)
        }

        btLigar.setOnClickListener {
            val ligarIntent = Intent(Intent.ACTION_DIAL)
            ligarIntent.data = Uri.parse("tel:130")
            startActivity(ligarIntent)
        }

        btExibir.setOnClickListener {
            // Converted from tvResultado.text = getString(R.string.tvTextHello, etNome.text);
            tvResultado.text = getString(R.string.tvTextHello, etNome.text);
        }
    }
}