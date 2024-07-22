package com.example.lesson9

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
    private lateinit var sharedPrefs: SharedPreferences
    private val valueKey: String = "valueKey"
    private var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        sharedPrefs = getSharedPreferences("My SP", Context.MODE_PRIVATE)
        value = sharedPrefs.getInt(valueKey, 0)

        val text = findViewById<TextView>(R.id.text)
        text.text = value.toString()
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            value++
            text.text = value.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        sharedPrefs.edit().putInt(valueKey, value).apply()
        super.onSaveInstanceState(outState)
    }
}
