package com.tnfigueiredo.docsample.domain.usecases

import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User
import com.tnfigueiredo.docsample.domain.ports.DepartmentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class RemoveDepartmentInformationUseCase {

    @Autowired
    private lateinit var departmentRepository: DepartmentRepository
    fun execute(department: Department): Result<Unit> = kotlin.runCatching {
        departmentRepository.delete(department)
    }

}
