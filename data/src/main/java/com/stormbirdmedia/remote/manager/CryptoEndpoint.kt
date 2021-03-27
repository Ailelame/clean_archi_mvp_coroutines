package com.stormbirdmedia.remote.manager

import com.stormbirdmedia.remote.model.BasicCryptoApi
import retrofit2.http.GET

interface CryptoEndpoint {

    @GET("exchanges/coinbasepro/assets")
    suspend fun getCryptoCurrencies(): List<BasicCryptoApi>
}