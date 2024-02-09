package com.tnfigueiredo.docsample.adapters.repositories

import com.tnfigueiredo.docsample.adapters.dataprovider.DepartmentJpaRepository
import com.tnfigueiredo.docsample.adapters.entities.DepartmentEntity
import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.repositories.DepartmentDomainRepository

class DepartmentDomainRepositoryImpl(private val departmentJpaRepository: DepartmentJpaRepository): DepartmentDomainRepository {
    override fun save(department: Department): Result<DepartmentEntity> = kotlin.runCatching {
        departmentJpaRepository.saveAndFlush(
            DepartmentEntity(
                id = department.id,
                name = department.name,
                abbreviation = department.abbreviation,
                creatorId = department.creatorId
            )
        )
    }

    override fun delete(department: Department): Result<Unit> = kotlin.runCatching {
        departmentJpaRepository.delete(DepartmentEntity(
            id = department.id,
            name = department.name,
            abbreviation = department.abbreviation,
            creatorId = department.creatorId
        ))
    }
}