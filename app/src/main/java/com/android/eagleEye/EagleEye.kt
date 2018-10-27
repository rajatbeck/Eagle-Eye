package com.android.eagleEye


import android.content.Context
import android.support.multidex.MultiDex
import com.android.eagleEye.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class EagleEye: DaggerApplication() {


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
       return DaggerAppComponent.builder().application(this).build()
    }


}