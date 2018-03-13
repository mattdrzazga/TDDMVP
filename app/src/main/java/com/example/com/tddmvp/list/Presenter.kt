package com.example.com.tddmvp.list

import com.example.com.tddmvp.BasePresenter
import javax.inject.Inject


class Presenter @Inject constructor(private val view: ListContract.View, private val repository: DataSource) : BasePresenter, ListContract.Presenter {

    override fun start() {
        loadData()
    }

    override fun stop() {

    }

    override fun loadData() {
        view.showProgress(true)
        repository.getData {
            view.showProgress(false)
            view.setList(it)
        }
    }
}
