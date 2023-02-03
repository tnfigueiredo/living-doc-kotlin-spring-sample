package com.tnfigueiredo.docsample.domain.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "DEPARTMENT")
data class Department(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?,
    @Column
    val name: String,
    @Column
    val abbreviation: String,
    @Column
    val creatorId: Int?
)