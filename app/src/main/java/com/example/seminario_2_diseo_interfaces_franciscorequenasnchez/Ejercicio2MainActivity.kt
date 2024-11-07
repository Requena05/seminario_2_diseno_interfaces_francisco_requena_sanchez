package com.example.seminario_2_diseo_interfaces_franciscorequenasnchez

import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio2MainActivity : AppCompatActivity() {

    private lateinit var carta1: ImageButton
    private lateinit var carta2: ImageButton
    private lateinit var carta3: ImageButton
    private lateinit var carta1_1:ImageView
    private lateinit var carta2_1:ImageView
    private lateinit var carta3_1:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio2_main)
        carta1 = findViewById(R.id.carta_1)
        carta2 = findViewById(R.id.carta_2)
        carta3 = findViewById(R.id.carta_3)
        carta1_1 = findViewById(R.id.carta1)
        carta2_1 = findViewById(R.id.carta2)
        carta3_1 = findViewById(R.id.carta3)
        carta1.setOnClickListener { flipCard(carta1) }
        carta2.setOnClickListener { flipCard2(carta2) }
        carta3.setOnClickListener { flipCard3(carta3) }


    }


    private fun flipCard(card: ImageButton=carta1) {
        if (card.rotationY == 0f) {
            card.animate().rotationY(360F).setDuration(1000).start()
            card.setImageResource(R.drawable.carta1)
            card.scaleType=ImageView.ScaleType.FIT_XY


        }
        else {
            card.animate().rotationY(0f).setDuration(1000).start()
            card.setImageResource(R.drawable.carta)
        }


    }
    private fun flipCard2(card: ImageButton=carta2) {
        if (card.rotationY == 0f) {
            card.animate().rotationY(360F).setDuration(1000).start()
            card.setImageResource(R.drawable.carta2)
            card.scaleType=ImageView.ScaleType.FIT_XY


        }
        else {
            card.animate().rotationY(0f).setDuration(1000).start()
            card.setImageResource(R.drawable.carta)
        }


    }
    private fun flipCard3(card: ImageButton=carta3) {
        if (card.rotationY == 0f) {
            card.animate().rotationY(360F).setDuration(1000).start()
            card.setImageResource(R.drawable.carta3)
            card.scaleType=ImageView.ScaleType.FIT_XY


        }
        else {
            card.animate().rotationY(0f).setDuration(1000).start()
            card.setImageResource(R.drawable.carta)
        }

    }
}