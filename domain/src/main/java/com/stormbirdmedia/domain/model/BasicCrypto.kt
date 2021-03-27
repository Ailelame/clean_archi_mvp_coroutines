package com.stormbirdmedia.domain.model

data class BasicCrypto(
    val id: Int,
    val name: String,
    val symbol: String,
    val tradingSymbol: String
) {
    val imageUrl = "https://assets.shrimpy.io/cryptoicons/png/${id}.png"
}