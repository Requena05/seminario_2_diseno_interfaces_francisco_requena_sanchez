package com.example.seminario_2_diseo_interfaces_franciscorequenasnchez

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Ejercicio1contador : AppCompatActivity() {

    private lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.ejercicio1_activity_main)
        texto = findViewById(R.id.contador)
        var contador: Long = texto.text.toString().toLong()

        //CountDownTimer
        var cuentaatras = object : CountDownTimer(contador*1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                contador--
                texto.text = contador.toString()
            }

            override fun onFinish() {
                val intent = Intent(this@Ejercicio1contador,Ejercicio1Explosioncita::class.java)
                startActivity(intent)
            }

        }.start()
    }
}