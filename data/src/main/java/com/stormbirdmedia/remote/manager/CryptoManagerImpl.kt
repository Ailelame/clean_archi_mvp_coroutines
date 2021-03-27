package com.stormbirdmedia.remote.manager

import android.util.Log
import com.stormbirdmedia.local.dao.BasicCryptoDao
import com.stormbirdmedia.remote.model.BasicCryptoApi

class CryptoManagerImpl(
    private val endpoint: CryptoEndpoint,
    private val basicCryptoDao: BasicCryptoDao
) : CryptoManager {

    override suspend fun getCryptoCurrencies(): List<BasicCryptoApi> {
        val cryptos = mutableListOf<BasicCryptoApi>()
        try {
            cryptos.addAll(endpoint.getCryptoCurrencies())
            basicCryptoDao.insert(cryptos.map { it.toLocal() })
        } catch (e: Exception) {
            Log.e(this.javaClass.simpleName, e.message)
        }
        return cryptos
    }
}