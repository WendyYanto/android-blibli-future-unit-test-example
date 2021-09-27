package com.dev.unittestexample.di

import com.dev.unittestexample.domain.GetUserUseCase
import com.dev.unittestexample.domain.GetUserUseCaseImpl
import com.dev.unittestexample.presentation.UserPresenter
import com.dev.unittestexample.presentation.UserPresenterImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


/**
 * Created by wendy.yanto on 9/25/2021
 */

@Module
@InstallIn(ActivityComponent::class)
abstract class ActivityModule {

    @Binds
    abstract fun bindGetUserCase(getUserUseCaseImpl: GetUserUseCaseImpl): GetUserUseCase

    @Binds
    abstract fun bindUserPresenter(userPresenterImpl: UserPresenterImpl): UserPresenter
}