package com.example.lesson9

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.lesson9.mvvm.ViewModelImpl

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val textView = findViewById<TextView>(R.id.text)
        val vm: ViewModelImpl = ViewModelProvider(this)[ViewModelImpl::class.java]
        vm.valueToUpdate.observe(this) {
            textView.text = it.toString()
        }
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            vm.addOneToValue()
        }
    }
}
