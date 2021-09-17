package com.dev.unittestexample.data.dao

import com.dev.unittestexample.data.entity.User


/**
 * Created by wendy.yanto on 9/17/2021
 */

class UserDao {

    fun getUser(id: String): User {
        return User(id = id)
    }
}