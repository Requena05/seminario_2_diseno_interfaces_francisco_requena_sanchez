package com.example.seminario_2_diseo_interfaces_franciscorequenasnchez

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Ejercicio3MainActivity : AppCompatActivity() {
    private lateinit var semaforoverde: ImageView
    private lateinit var semaforoamarillo: ImageView
    private lateinit var semafororojo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio3_main)
        semaforoverde = findViewById(R.id.semaforoverde)
        semaforoamarillo = findViewById(R.id.semaforoamarillo)
        semafororojo = findViewById(R.id.semafororojo)
        semaforoverde.visibility = View.VISIBLE
        semaforoamarillo.visibility = View.INVISIBLE
        semafororojo.visibility = View.INVISIBLE
        var terminar = true

        lifecycleScope.launch {
            while (terminar) {
                delay(2000)
                semaforoamarillo.visibility = View.VISIBLE
                semaforoverde.visibility = View.INVISIBLE
                delay(1000)
                semafororojo.visibility = View.VISIBLE
                semaforoamarillo.visibility = View.INVISIBLE
                delay(2000)
                semaforoverde.visibility = View.VISIBLE
                semafororojo.visibility = View.INVISIBLE
                delay(1000)
            }
        }
    }
}
