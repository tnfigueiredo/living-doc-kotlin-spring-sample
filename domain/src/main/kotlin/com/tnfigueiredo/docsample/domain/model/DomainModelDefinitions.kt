package com.tnfigueiredo.docsample.domain.model

open class Department(
    open val id: Int? = null,
    open val name: String = "",
    open val abbreviation: String = "",
    open val creatorId: Int? = 1
)

enum class UserProfile{
    DEPARTMENT_ADMINISTRATOR,
    DEPARTMENT_EMPLOYEE,
    STUDENT
}

sealed class User(
    open val id: Int?,
    open val username: String,
    open val profile: UserProfile
){
    data class GeneralUser(
        override val id: Int?,
        override val username: String,
        override val profile: UserProfile
    ): User(id, username, profile)

    data class Student(
        override val id: Int?,
        override val username: String
    ): User(id, username, UserProfile.STUDENT)
}