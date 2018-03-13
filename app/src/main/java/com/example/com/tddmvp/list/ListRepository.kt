package com.example.com.tddmvp.list

import javax.inject.Inject

class ListRepository @Inject constructor(): DataSource {
    override fun getData(callback: DataSource.Callback) {
        callback.onDataLoaded(listOf("1", "2", "3"))
    }

    fun getDataLambda(callback: (data: List<String>) -> Unit) {
        getData(object : DataSource.Callback {
            override fun onDataLoaded(data: MutableList<String>) {
                callback(data)
            }
        })
    }
}
