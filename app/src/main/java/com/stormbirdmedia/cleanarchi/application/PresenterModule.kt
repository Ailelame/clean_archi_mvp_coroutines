package com.stormbirdmedia.cleanarchi.application

import com.stormbirdmedia.cleanarchi.screen.main.MainContract
import com.stormbirdmedia.cleanarchi.screen.main.MainPresenter
import org.koin.dsl.module


val presenterModule = module {
    single<MainContract.Presenter> { (view: MainContract.View) -> MainPresenter(view, get()) }
}