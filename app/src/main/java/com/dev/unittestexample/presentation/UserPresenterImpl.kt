package com.dev.unittestexample.presentation

import com.dev.unittestexample.domain.GetUserUseCase
import javax.inject.Inject


/**
 * Created by wendy.yanto on 9/17/2021
 */

class UserPresenterImpl @Inject constructor(private val getUserUseCase: GetUserUseCase) :
    UserPresenter {

    override fun getUsername(id: String): String {
        val user = getUserUseCase.getUser(id)
        return user?.name.orEmpty()
    }

    override fun getUniqueCode(id: String): String {
        val user = getUserUseCase.getUser(id)
        return user?.getUniqueCode().orEmpty()
    }
}