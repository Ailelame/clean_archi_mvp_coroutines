package com.stormbirdmedia.cleanarchi.screen.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.stormbirdmedia.cleanarchi.databinding.ActivityMainBinding
import com.stormbirdmedia.domain.model.BasicCrypto
import com.stormbirdmedia.cleanarchi.screen.main.adapter.MainAdapter
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter: MainContract.Presenter by inject { parametersOf(this) }

    private var binding: ActivityMainBinding? = null
    val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root

        setContentView(view)

        binding?.rvCryptos?.layoutManager = LinearLayoutManager(this)
        binding?.rvCryptos?.adapter = adapter

        presenter.loadData()

    }

    override fun displayBasicCryptos(items: List<BasicCrypto>) {
        adapter.setItems(items)
    }
}