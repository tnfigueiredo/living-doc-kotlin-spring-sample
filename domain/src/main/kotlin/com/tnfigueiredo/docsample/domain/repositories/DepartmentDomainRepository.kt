package com.tnfigueiredo.docsample.domain.repositories

import com.tnfigueiredo.docsample.domain.model.Department

interface DepartmentDomainRepository {

    fun save(department: Department): Result<Department>

    fun delete(department: Department): Result<Unit>

}