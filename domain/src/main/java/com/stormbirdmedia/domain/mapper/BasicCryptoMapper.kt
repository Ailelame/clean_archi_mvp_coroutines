package com.stormbirdmedia.domain.mapper

import com.stormbirdmedia.remote.model.BasicCryptoApi
import com.stormbirdmedia.domain.model.BasicCrypto
import com.stormbirdmedia.local.model.BasicCryptoLocal

class BasicCryptoMapper {
    companion object {
        fun mapApiToDomain(cryptoApi: BasicCryptoApi) : BasicCrypto {
            return BasicCrypto(
                cryptoApi.id,
                cryptoApi.name,
                cryptoApi.symbol,
                cryptoApi.tradingSymbol
            )
        }
        fun mapLocalToDomain(cryptoLocal: BasicCryptoLocal) : BasicCrypto {
            return BasicCrypto(
                cryptoLocal.id,
                cryptoLocal.name,
                cryptoLocal.symbol,
                cryptoLocal.tradingSymbol
            )
        }
    }
}