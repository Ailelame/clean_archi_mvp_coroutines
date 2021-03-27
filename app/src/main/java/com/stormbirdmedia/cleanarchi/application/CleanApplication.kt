package com.stormbirdmedia.cleanarchi.application

import android.app.Application
import com.stormbirdmedia.di.dataModule
import com.stormbirdmedia.domain.di.domainModule
import com.stormbirdmedia.cleanarchi.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber
import timber.log.Timber.DebugTree


class CleanApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Android context
            androidContext(this@CleanApplication)
            // modules
            modules(
                networkModule,
                dataModule,
                domainModule,
                presenterModule)
        }

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }

}