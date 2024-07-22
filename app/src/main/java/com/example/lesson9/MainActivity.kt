package com.example.lesson9

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.lesson9.mvp.PresenterImpl
import com.example.lesson9.mvp.View

class MainActivity : Activity(), View {
    private val presenter = PresenterImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        presenter.setView(this)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            presenter.addOneToValue()
        }
    }

    override fun updateValue(value: Int) {
        val text = findViewById<TextView>(R.id.text)
        text.text = value.toString()
    }
}
