package com.kikappsmx.hiltexample.soda

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object SodaModule {

    @Provides
    fun provideSodaMaker(): SodaMaker {
        return SodaMakerImpl("Coke")
    }
}
