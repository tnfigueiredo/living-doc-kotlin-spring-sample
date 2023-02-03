package com.tnfigueiredo.docsample.domain.model

import jakarta.persistence.*


@Entity(name = "DEPARTMENT")
data class Department(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int? = null,
    @Column(unique = true)
    val name: String = "",
    @Column(unique = true)
    val abbreviation: String = "",
    @Column
    val creatorId: Int? = 1
)
