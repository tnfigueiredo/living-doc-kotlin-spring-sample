package com.tnfigueiredo.docsample.domain.dataprovider

import com.tnfigueiredo.docsample.domain.model.Department
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DepartmentRepository: JpaRepository<Department, Int?> {

    fun findByName(name: String): Department?

}