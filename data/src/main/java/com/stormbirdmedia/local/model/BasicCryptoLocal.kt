package com.stormbirdmedia.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.stormbirdmedia.remote.model.BasicCryptoApi

@Entity
data class BasicCryptoLocal(
    @PrimaryKey
    val id: Int,
    val name: String,
    val symbol: String,
    val tradingSymbol: String
)