package com.stormbirdmedia.cleanarchi.application

import com.stormbirdmedia.remote.manager.CryptoEndpoint
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

val networkModule = module {

    single {
        buildRetrofit()
    }

    single<CryptoEndpoint> { get<Retrofit>().create(CryptoEndpoint::class.java) }

}

private fun buildRetrofit(): Retrofit {
    val okHttpClient = OkHttpClient.Builder().build()
    val rxAdapter = RxJava3CallAdapterFactory.create()
    return Retrofit.Builder().baseUrl("https://dev-api.shrimpy.io/v1/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(okHttpClient)
        .addCallAdapterFactory(rxAdapter)
        .build()
}