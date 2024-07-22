package com.example.lesson9.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelImpl: ViewModel() {
    private val model = ModelImpl
    val valueToUpdate = MutableLiveData(model.getValue())

    fun addOneToValue() {
        model.addOneToValue()
        valueToUpdate.value = model.getValue()
    }
}