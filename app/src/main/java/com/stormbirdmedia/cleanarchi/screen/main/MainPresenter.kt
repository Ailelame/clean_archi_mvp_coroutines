package com.stormbirdmedia.cleanarchi.screen.main

import com.stormbirdmedia.cleanarchi.base.BasePresenter
import com.stormbirdmedia.domain.usecase.cryptodata.CryptoDataUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainPresenter(val view: MainContract.View, private val cryptoManager: CryptoDataUseCase) :
    BasePresenter(), MainContract.Presenter {


    override fun loadData() {
        launch {
            val cryptos = cryptoManager.getCryptoCurrencies()

            withContext(Dispatchers.Main) {
                view.displayBasicCryptos(cryptos)
            }
        }
    }
}