package com.stormbirdmedia.remote.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.stormbirdmedia.local.model.BasicCryptoLocal

@JsonClass(generateAdapter = true)
data class BasicCryptoApi(
    @Json(name = "id")
    val id: Int,
    @Json(name = "name")
    val name: String,
    @Json(name = "symbol")
    val symbol: String,
    @Json(name = "tradingSymbol")
    val tradingSymbol: String
) {
    fun toLocal(): BasicCryptoLocal{
        return BasicCryptoLocal(
            id,
            name,
            symbol,
            tradingSymbol
        )
    }
}