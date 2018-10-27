package com.android.eagleEye.di.module

import android.content.Context
import com.android.eagleEye.EagleEye
import dagger.Binds
import dagger.Module


@Module
abstract class AppModule {

    @Binds
    abstract fun provideContext(application: EagleEye): Context

}