package com.android.eagleEye.di.component

import android.app.Application
import com.android.eagleEye.EagleEye
import com.android.eagleEye.di.module.AppModule
import com.android.eagleEye.di.module.NetModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    NetModule::class
])
interface AppComponent : AndroidInjector<EagleEye> {

   override fun inject(pokemonApp: EagleEye)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }


}