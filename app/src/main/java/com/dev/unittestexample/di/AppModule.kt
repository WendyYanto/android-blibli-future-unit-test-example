package com.dev.unittestexample.di

import com.dev.unittestexample.data.dao.UserDao
import com.dev.unittestexample.domain.GetUserCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent


/**
 * Created by wendy.yanto on 9/25/2021
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideUserDao(): UserDao {
        return UserDao()
    }
}