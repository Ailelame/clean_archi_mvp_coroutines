package com.stormbirdmedia.domain.usecase.cryptodata

import com.stormbirdmedia.domain.mapper.BasicCryptoMapper
import com.stormbirdmedia.domain.model.BasicCrypto
import com.stormbirdmedia.local.dao.BasicCryptoDao
import com.stormbirdmedia.local.model.BasicCryptoLocal
import com.stormbirdmedia.remote.manager.CryptoManager

class CryptoDataUseCaseImpl(
    private val cryptoManager: CryptoManager,
    private val basicCryptoDao: BasicCryptoDao
) : CryptoDataUseCase {
    override suspend fun getCryptoCurrencies(): List<BasicCrypto> {
        val localCryptos: List<BasicCryptoLocal> = basicCryptoDao.getAllCryptos()
        if (localCryptos.isEmpty()) {
            val apiCryptos = cryptoManager.getCryptoCurrencies()
            return apiCryptos.map { BasicCryptoMapper.mapApiToDomain(it) }
        } else {
            return localCryptos.map { BasicCryptoMapper.mapLocalToDomain(it) }

        }
    }
}