package com.k4dima.party.main.domain.di

import com.k4dima.party.main.domain.MainUseCase
import com.k4dima.party.main.domain.ServersUseCase
import com.k4dima.party.main.ui.di.MainScope
import dagger.Module
import dagger.Provides

@Module
object UseCaseModule {
    @JvmStatic
    @MainScope
    @Provides
    fun useCase(mainUseCase: MainUseCase): ServersUseCase = mainUseCase
}