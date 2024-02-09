package com.tnfigueiredo.docsample.domain.usecases

import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.repositories.DepartmentDomainRepository

class RemoveDepartmentInformationUseCase (
    private val departmentDomainRepository: DepartmentDomainRepository
) {

    fun execute(department: Department): Result<Unit> = kotlin.runCatching {
        departmentDomainRepository.delete(department)
    }

}