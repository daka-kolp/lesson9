package com.example.lesson9

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
    private val valueKey: String = "valueKey"
    private var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        value = savedInstanceState?.getInt(valueKey) ?: 0

        val text = findViewById<TextView>(R.id.text)
        text.text = value.toString()
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            value++
            text.text = value.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(valueKey, value)
        super.onSaveInstanceState(outState)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        outState.putInt(valueKey, value)
        super.onSaveInstanceState(outState, outPersistentState)
    }
}
