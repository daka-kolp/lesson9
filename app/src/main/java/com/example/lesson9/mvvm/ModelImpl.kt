package com.example.lesson9.mvvm

import com.example.lesson9.MyApp

object ModelImpl: Model {
    private const val valueKey: String = "valueKey"
    private val sharedPrefs = MyApp.getApp().getSharedPreferences()
    private var value:Int = sharedPrefs.getInt(valueKey, 0)

    override fun getValue(): Int = value

    override fun addOneToValue() {
        sharedPrefs.edit().putInt(valueKey, value++).apply()
    }
}