package com.k4dima.party.main.presentation.di

import androidx.lifecycle.ViewModel
import com.k4dima.party.app.presentation.di.ViewModelKey
import com.k4dima.party.main.presentation.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(repoViewModel: MainViewModel): ViewModel
}