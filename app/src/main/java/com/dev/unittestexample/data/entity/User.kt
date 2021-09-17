package com.dev.unittestexample.data.entity


/**
 * Created by wendy.yanto on 9/17/2021
 */

data class User(
    var id: String = "",
    val name: String = "User",
    val age: Int = 25
) {

    fun getUniqueCode(): String {
        return "${name}_${id}_2021_at_${age}"
    }
}