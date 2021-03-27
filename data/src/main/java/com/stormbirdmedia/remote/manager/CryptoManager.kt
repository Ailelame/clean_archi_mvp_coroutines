package com.stormbirdmedia.remote.manager

import com.stormbirdmedia.remote.model.BasicCryptoApi
import io.reactivex.rxjava3.core.Single

interface CryptoManager {
    suspend fun getCryptoCurrencies() : List<BasicCryptoApi>
}