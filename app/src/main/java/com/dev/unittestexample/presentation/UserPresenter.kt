package com.dev.unittestexample.presentation


/**
 * Created by wendy.yanto on 9/25/2021
 */

interface UserPresenter {

    fun getUsername(id: String): String

    fun getUniqueCode(id: String): String
}