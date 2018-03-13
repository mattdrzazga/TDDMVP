package com.example.com.tddmvp.list

import com.example.com.tddmvp.BasePresenter
import com.example.com.tddmvp.BaseView

interface ListContract {

    interface View : BaseView<Presenter> {
        fun showProgress(show: Boolean)
        fun setList(list: List<String>)
    }

    interface Presenter : BasePresenter {
        fun loadData()
    }
}
