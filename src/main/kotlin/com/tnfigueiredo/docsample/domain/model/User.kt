package com.tnfigueiredo.docsample.domain.model

enum class UserProfile{
    DEPARTMENT_ADMINISTRATOR
}

data class User(
    val id: Number?,
    val username: String,
    val profile: UserProfile
)