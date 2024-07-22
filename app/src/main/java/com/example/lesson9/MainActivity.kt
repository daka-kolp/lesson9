package com.example.lesson9

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
    private lateinit var app: MyApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        app = MyApp.getApp()

        val text = findViewById<TextView>(R.id.text)
        text.text = app.getValue()
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            app.addOne()
            text.text = app.getValue()
        }
    }
}
