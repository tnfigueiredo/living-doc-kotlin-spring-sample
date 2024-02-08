package com.tnfigueiredo.docsample.adapters.domain.usecases

import com.tnfigueiredo.docsample.adapters.domain.model.Department
import com.tnfigueiredo.docsample.adapters.domain.model.User.GeneralUser
import com.tnfigueiredo.docsample.adapters.domain.dataprovider.DepartmentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class SaveDepartmentInformationUseCase {

    @Autowired
    private lateinit var departmentRepository: DepartmentRepository
    fun execute(generalUser: GeneralUser, department: Department): Result<Department> = kotlin.runCatching {
        departmentRepository.saveAndFlush(department.copy(creatorId = generalUser.id))
    }

}
