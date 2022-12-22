package com.beslimir.dagger2_preparation

import dagger.Module
import dagger.Provides

@Module
class CustomClassModule {

    @Provides
    fun provideCustomClass() = CustomClass()
}