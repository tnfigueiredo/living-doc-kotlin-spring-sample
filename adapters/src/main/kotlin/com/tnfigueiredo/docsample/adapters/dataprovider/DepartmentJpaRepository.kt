package com.tnfigueiredo.docsample.adapters.dataprovider

import com.tnfigueiredo.docsample.adapters.entities.DepartmentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DepartmentJpaRepository: JpaRepository<DepartmentEntity, Int?> {

    fun findByName(name: String): DepartmentEntity?

}