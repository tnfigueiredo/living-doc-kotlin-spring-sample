package com.tnfigueiredo.docsample.adapters.domain.dataprovider

import com.tnfigueiredo.docsample.adapters.domain.model.Department
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DepartmentRepository: JpaRepository<Department, Int?> {

    fun findByName(name: String): Department?

}