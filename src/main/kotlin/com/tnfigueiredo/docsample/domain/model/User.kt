package com.tnfigueiredo.docsample.domain.model

enum class UserProfile{
    DEPARTMENT_ADMINISTRATOR
}


data class User(
    val id: Int?,
    val username: String,
    val profile: UserProfile
)