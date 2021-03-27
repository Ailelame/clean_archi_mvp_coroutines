package com.stormbirdmedia.di

import androidx.room.Room
import com.stormbirdmedia.local.AppDatabase
import com.stormbirdmedia.remote.manager.CryptoManager
import com.stormbirdmedia.remote.manager.CryptoManagerImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataModule = module {

    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "db_crypto"
        ).build()
    }

    single { get<AppDatabase>().basicCryptoDao() }

    factory<CryptoManager> {
        CryptoManagerImpl(get(), get())
    }

}