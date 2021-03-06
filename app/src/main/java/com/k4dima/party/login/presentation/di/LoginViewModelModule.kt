package com.k4dima.party.login.presentation.di

import androidx.lifecycle.ViewModel
import com.k4dima.party.app.presentation.di.ViewModelKey
import com.k4dima.party.login.presentation.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface LoginViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    fun bindMainViewModel(repoViewModel: LoginViewModel): ViewModel
}