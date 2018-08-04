package com.android.pokemonapp


import android.content.Context
import android.support.multidex.MultiDex
import com.android.pokemonapp.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class PokemonApp: DaggerApplication() {


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
       return DaggerAppComponent.builder().application(this).build()
    }


}