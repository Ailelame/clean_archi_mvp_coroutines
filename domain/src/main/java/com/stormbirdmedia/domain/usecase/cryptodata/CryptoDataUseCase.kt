package com.stormbirdmedia.domain.usecase.cryptodata

import com.stormbirdmedia.domain.model.BasicCrypto
import io.reactivex.rxjava3.core.Single

interface CryptoDataUseCase {
   suspend fun getCryptoCurrencies() : List<BasicCrypto>
}