package com.dev.unittestexample.domain

import com.dev.unittestexample.data.entity.User


/**
 * Created by wendy.yanto on 9/25/2021
 */

interface GetUserCase {

    fun getUser(id: String): User?
}