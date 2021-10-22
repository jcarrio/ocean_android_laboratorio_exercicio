package com.example.ocean_android_laboratorio_exercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btTerceiraTela = findViewById<Button>(R.id.btTerceiraTela)
        val etTexto = findViewById<EditText>(R.id.etTexto)

        btTerceiraTela.setOnClickListener {
            val terceiraTelaIntent = Intent(this, ThirdActivity::class.java)

            terceiraTelaIntent.putExtra("EXTRA_INFO", etTexto.text.toString())
            startActivity(terceiraTelaIntent)
        }

        /*
        Exercício:
        Revisitar o design das telas e renomear botões, strings, etc    (ok)
        Adicionar um EditText na segunda tela                           (ok)
        Enviar o valor dele para a terceira tela                        (ok)
        Exibir o valor dele no TextView da terceira tela
         */
    }
}