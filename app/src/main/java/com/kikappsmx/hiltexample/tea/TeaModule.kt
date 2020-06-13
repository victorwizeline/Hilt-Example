package com.kikappsmx.hiltexample.tea

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class TeaModule {

    @Binds
    abstract fun bindTeaMaker(
        teaMakerImpl: TeaMakerImpl
    ): TeaMaker
}
