package com.dev.unittestexample.domain

import com.dev.unittestexample.data.dao.UserDao
import com.dev.unittestexample.data.entity.User


/**
 * Created by wendy.yanto on 9/17/2021
 */

class GetUserUseCase constructor(private val userDao: UserDao) {

    fun getUser(id: String): User? {
        if (id == "") {
            return null
        }
        return userDao.getUser(id)
    }
}