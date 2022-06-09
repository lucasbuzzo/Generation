package com.generation.projetoteste.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.generation.projetoteste.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        buttonD6.setOnClickListener{
            //Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }

    }
    private fun rolarDados(lados: Int) {
        val rolagem = (1..lados).random()
        val textDice = findViewById<TextView>(R.id.textDice)
        textDice.text = rolagem.toString()
    }
}