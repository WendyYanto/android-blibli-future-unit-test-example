package com.dev.unittestexample.data.dao

import org.junit.Assert
import org.junit.Test


/**
 * Created by wendy.yanto on 9/17/2021
 */

class UserDaoTest {

    private val userDao = UserDao()

    @Test
    fun `getUser should return user with id equals to ID`() {
        val result = userDao.getUser("ID")

        Assert.assertEquals(result.id, "ID")
    }
}