package com.example.lesson9.mvp

object ModelImpl: Model {
    private var value:Int = 0

    override fun getValue(): Int = value

    override fun addOneToValue() { value++ }
}