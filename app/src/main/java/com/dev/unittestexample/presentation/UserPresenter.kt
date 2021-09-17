package com.dev.unittestexample.presentation

import com.dev.unittestexample.data.entity.User
import com.dev.unittestexample.domain.GetUserUseCase


/**
 * Created by wendy.yanto on 9/17/2021
 */

class UserPresenter {

    private val getUserUseCase = GetUserUseCase()

    fun getUsername(id: String): String {
        val user = getUserUseCase.getUser(id)
        return user?.name.orEmpty()
    }
}