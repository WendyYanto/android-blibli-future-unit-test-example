package com.dev.unittestexample.domain

import com.dev.unittestexample.data.dao.UserDao
import com.dev.unittestexample.data.entity.User
import com.dev.unittestexample.domain.GetUserUseCaseImpl
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations


/**
 * Created by wendy.yanto on 9/27/2021
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
    fun `getUser return null if ID is empty`() {
        val result = getUserUseCase.getUser("")

        Assert.assertNull(result)
    }

    @Test
    fun `getUser should return user data if ID is not empty`() {
        Mockito.`when`(userDao.getUser("ID")).thenReturn(User(id = "ID", name = "NAME", age = 18))

        val result = getUserUseCase.getUser("ID")

        Assert.assertEquals(result?.id, "ID")
        Assert.assertEquals(result?.name, "NAME")
        Assert.assertEquals(result?.age, 18)
        Assert.assertEquals(result?.getUniqueCode(), "NAME_ID_2021_at_18")

        Mockito.verify(userDao).getUser("ID")
    }
}