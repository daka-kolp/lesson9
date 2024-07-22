package com.example.lesson9.mvp

class PresenterImpl: Presenter {
    private val model = ModelImpl
    private var view:View? = null
    override fun addOneToValue() {
        model.addOneToValue()
        view?.updateValue(model.getValue())
    }

    override fun setView(view: View) {
        this.view = view
        view.updateValue(model.getValue())
    }
}