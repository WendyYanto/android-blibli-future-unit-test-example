package com.dev.unittestexample.presentation

import com.dev.unittestexample.data.entity.User
import com.dev.unittestexample.domain.GetUserUseCase
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

class UserPresenterTest {

    @InjectMocks
    private lateinit var userPresenter: UserPresenterImpl

    @Mock
    private lateinit var getUserUseCase: GetUserUseCase

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
    }

    @After
    fun tearDown() {
        Mockito.verifyNoMoreInteractions(getUserUseCase)
    }

    @Test
    fun `getUsername should return valid username when user is not null`() {
        Mockito.`when`(getUserUseCase.getUser("ID")).thenReturn(User(name = "NAME"))

        val userName = userPresenter.getUsername("ID")

        Assert.assertEquals(userName, "NAME")
        Mockito.verify(getUserUseCase).getUser("ID")
    }

    @Test
    fun `getUsername should return empty username when user is null`() {
        Mockito.`when`(getUserUseCase.getUser("ID")).thenReturn(null)

        val userName = userPresenter.getUsername("ID")

        Assert.assertEquals(userName, "")
        Mockito.verify(getUserUseCase).getUser("ID")
    }

    @Test
    fun `getUniqueCode should return valid unique when user is not null`() {
        Mockito.`when`(getUserUseCase.getUser("ID")).thenReturn(User(name = "NAME", id = "ID"))

        val uniqueCode = userPresenter.getUniqueCode("ID")

        Assert.assertEquals(uniqueCode, "NAME_ID_2021_at_25")
        Mockito.verify(getUserUseCase).getUser("ID")
    }

    @Test
    fun `getUniqueCode should return empty unique code when user is null`() {
        Mockito.`when`(getUserUseCase.getUser("ID")).thenReturn(null)

        val uniqueCode = userPresenter.getUniqueCode("ID")

        Assert.assertEquals(uniqueCode, "")
        Mockito.verify(getUserUseCase).getUser("ID")
    }
}