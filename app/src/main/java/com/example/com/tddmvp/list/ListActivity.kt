package com.example.com.tddmvp.list

import android.os.Bundle
import android.view.View
import com.example.com.tddmvp.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class ListActivity : DaggerAppCompatActivity(), ListContract.View {
    @Inject
    lateinit var presenter: ListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.stop()
    }

    override fun showProgress(show: Boolean) {
        progressBar.visibility = when (show) {
            true -> View.VISIBLE
            false -> View.GONE
        }
    }

    override fun setList(list: List<String>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
