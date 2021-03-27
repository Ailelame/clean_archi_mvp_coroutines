package com.stormbirdmedia.domain.di

import com.stormbirdmedia.domain.usecase.cryptodata.CryptoDataUseCase
import com.stormbirdmedia.domain.usecase.cryptodata.CryptoDataUseCaseImpl
import org.koin.dsl.module

val domainModule = module {
        factory<CryptoDataUseCase> { CryptoDataUseCaseImpl(get(), get()) }
}