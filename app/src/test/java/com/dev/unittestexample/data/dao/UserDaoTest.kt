package com.dev.unittestexample.data.dao

import org.junit.Assert
import org.junit.Before
import org.junit.Test


/**
 * Created by wendy.yanto on 9/27/2021
 */

class UserDaoTest {

     private val userDao = UserDao()

    @Test
    fun `getUser should return valid user data`() {
        val result = userDao.getUser("ID")

        with(result) {
            Assert.assertEquals(id, "ID")
            Assert.assertEquals(name, "User")
            Assert.assertEquals(age, 25)
            Assert.assertEquals(getUniqueCode(), "User_ID_2021_at_25")
        }
    }
}