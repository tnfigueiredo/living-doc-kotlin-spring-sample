package com.tnfigueiredo.docsample.domain.model

data class Department(
    val id: Number?,
    val name: String,
    val abbreviation: String,
    val creator: User?
)