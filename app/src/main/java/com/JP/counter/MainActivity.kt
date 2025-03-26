package com.JP.counter

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter : Int = 0
    private lateinit var sharedPreferences: android.content.SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnUp = findViewById<Button>(R.id.btnUp)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnDown = findViewById<Button>(R.id.btnDown)

        sharedPreferences = getSharedPreferences("CounterPrefs", Context.MODE_PRIVATE)

        counter = sharedPreferences.getInt("count", 0)

        if(counter > 0)
            btnUp.text = "$counter"
        else
            btnUp.text = "Start"


        btnDown.isEnabled = counter > 0
        btnReset.isEnabled = counter > 0
        btnUp.setOnClickListener {
            counter += 1
            updateUI( btnDown, btnReset, btnUp)
            saveCount()
        }

        btnDown.setOnClickListener {
            counter -= 1
            updateUI( btnDown, btnReset, btnUp)
            saveCount()
        }

        btnReset.setOnClickListener {
            counter = 0
            updateUI( btnDown, btnReset, btnUp)
            saveCount()
        }
    }

    private fun saveCount() {
        val editor = sharedPreferences.edit()
        editor.putInt("count", counter)
        editor.apply()
    }

    private fun updateUI(btnDown: Button, btnReset: Button,btnUp : Button) {
        btnUp.text = "$counter"
        btnDown.isEnabled = counter > 0
        btnReset.isEnabled = counter > 0
    }
}