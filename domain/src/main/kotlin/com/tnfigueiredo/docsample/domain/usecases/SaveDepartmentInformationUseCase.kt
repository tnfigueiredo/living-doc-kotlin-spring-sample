package com.tnfigueiredo.docsample.domain.usecases

import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User.GeneralUser
import com.tnfigueiredo.docsample.domain.repositories.DepartmentDomainRepository

class SaveDepartmentInformationUseCase(
    private val departmentDomainRepository: DepartmentDomainRepository
) {

    fun execute(generalUser: GeneralUser, department: Department): Result<Department> =
        departmentDomainRepository.save(Department(
            id = department.id,
            name = department.name,
            abbreviation = department.abbreviation,
            creatorId = generalUser.id))

}