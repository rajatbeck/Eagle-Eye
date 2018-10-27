package com.android.eagleEye.di.module

import android.arch.lifecycle.ViewModelProvider
import com.android.eagleEye.di.ViewModelFactory
import dagger.Binds
import dagger.Module


@Suppress("unused")
@Module
abstract class ViewModelModule {


    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}