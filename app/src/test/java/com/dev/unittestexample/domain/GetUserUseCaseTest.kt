package com.dev.unittestexample.domain

import com.dev.unittestexample.data.dao.UserDao
import com.dev.unittestexample.data.entity.User
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations


/**
 * Created by wendy.yanto on 9/17/2021
 */

class GetUserUseCaseTest {

    @InjectMocks
    private lateinit var getUserUseCase: GetUserUseCaseImpl

    @Mock
    private lateinit var userDao: UserDao

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
    }

    @After
    fun tearDown() {
        Mockito.verifyNoMoreInteractions(userDao)
    }

    @Test
    fun `getUser should return user with USER_ID and valid uniqueCode`() {
        Mockito.`when`(userDao.getUser("USER_ID")).thenReturn(User(id = "USER_ID"))
        val user = getUserUseCase.getUser("USER_ID")

        Assert.assertEquals(user?.id, "USER_ID")
        Assert.assertEquals(user?.getUniqueCode(), "User_USER_ID_2021_at_25")

        Mockito.verify(userDao).getUser("USER_ID")
    }

    @Test
    fun `getUser should return user with YANTO_USER_ID and valid uniqueCode`() {
        Mockito.`when`(userDao.getUser("ID_YANTO")).thenReturn(User(id = "ID_YANTO", name = "YANTO"))

        val user = getUserUseCase.getUser("ID_YANTO")

        Assert.assertEquals(user?.id, "ID_YANTO")
        Assert.assertEquals(user?.getUniqueCode(), "YANTO_ID_YANTO_2021_at_25")
        Mockito.verify(userDao).getUser("ID_YANTO")
    }

    @Test
    fun `getUser should return null if ID is empty string`() {
        val user = getUserUseCase.getUser("")

        Assert.assertNull(user)
    }
}