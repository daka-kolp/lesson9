package com.example.lesson9

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class MyApp : Application() {
    private lateinit var sharedPrefs: SharedPreferences

    companion object {
        private lateinit var instance: MyApp
        fun getApp() = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        sharedPrefs = getSharedPreferences("My SP", Context.MODE_PRIVATE)
    }

    fun getSharedPreferences() = sharedPrefs
}