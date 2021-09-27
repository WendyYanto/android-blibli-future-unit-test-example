package com.dev.unittestexample.domain

import com.dev.unittestexample.data.dao.UserDao
import com.dev.unittestexample.data.entity.User
import javax.inject.Inject


/**
 * Created by wendy.yanto on 9/17/2021
 */

class GetUserUseCaseImpl @Inject constructor(private val userDao: UserDao) : GetUserUseCase {

    override fun getUser(id: String): User? {
        if (id == "") {
            return null
        }
        return userDao.getUser(id)
    }
}