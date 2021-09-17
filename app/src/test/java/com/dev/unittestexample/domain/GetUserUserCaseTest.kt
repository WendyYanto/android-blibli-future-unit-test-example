package com.dev.unittestexample.domain

import org.junit.Assert
import org.junit.Test


/**
 * Created by wendy.yanto on 9/17/2021
 */

class GetUserUserCaseTest {

    private val getUserUseCase = GetUserUseCase()

    @Test
    fun `getUser should return user with USER_ID and valid uniqueCode`() {
        val user = getUserUseCase.getUser("USER_ID")

        Assert.assertEquals(user?.id, "USER_ID")
        Assert.assertEquals(user?.getUniqueCode(), "User_USER_ID_2021_at_25")
    }

    @Test
    fun `getUser should return user with YANTO_USER_ID and valid uniqueCode`() {
        val user = getUserUseCase.getUser("ID_YANTO")

        Assert.assertEquals(user?.id, "ID_YANTO")
        Assert.assertEquals(user?.getUniqueCode(), "YANTO_ID_YANTO_2021_at_25")
    }

    @Test
    fun `getUser should return null if ID is empty string`() {
        val user = getUserUseCase.getUser("")

        Assert.assertNull(user)
    }
}