package com.stormbirdmedia.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.stormbirdmedia.local.model.BasicCryptoLocal

@Dao
interface BasicCryptoDao : BaseDao<BasicCryptoLocal> {
    @Query("SELECT * FROM BasicCryptoLocal")
    suspend fun getAllCryptos(): List<BasicCryptoLocal>
}