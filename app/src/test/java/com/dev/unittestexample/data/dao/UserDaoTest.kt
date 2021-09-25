package com.dev.unittestexample.data.dao

import org.junit.Assert
import org.junit.Test


/**
 * Created by wendy.yanto on 9/17/2021
 */

class UserDaoTest {

    private val userDao = UserDao()

    @Test
    fun `getUser should return valid user data`() {
        val result = userDao.getUser("ID")

        Assert.assertEquals(result.id, "ID")
        Assert.assertEquals(result.getUniqueCode(), "User_ID_2021_at_25")
        Assert.assertEquals(result.age, 25)
        Assert.assertEquals(result.name, "User")
    }
}