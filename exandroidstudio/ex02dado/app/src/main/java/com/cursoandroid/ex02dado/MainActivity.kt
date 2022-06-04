package com.cursoandroid.ex02dado

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD6.setOnClickListener {
            rolarDados(6,1)
        }
        buttonD12.setOnClickListener {
            rolarDados(12, 2)
        }
        buttonD20.setOnClickListener {
            rolarDados(20, 3)
        }

    }
    @SuppressLint("CutPasteId")
    private fun rolarDados(
        lados: Int,
        roll: Int
    ) {
        val rolagem = (1..lados).random()
        when (roll) {
            1 -> {val rolagem = (1..lados).random()
                val textDado = findViewById<TextView>(R.id.textView4)
                textDado.text = rolagem.toString()}
            2 -> {
                val rolagem = (1..lados).random()
                val textDado2 = findViewById<TextView>(R.id.textView4)
                textDado2.text = rolagem.toString()}
            3 -> {
                val rolagem = (1..lados).random()
                val textDado3 = findViewById<TextView>(R.id.textView4)
                textDado3.text = rolagem.toString()
            }
        }
    }
}