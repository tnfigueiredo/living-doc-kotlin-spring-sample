package com.tnfigueiredo.docsample.adapters.domain.usecases

import com.tnfigueiredo.docsample.adapters.domain.model.Department
import com.tnfigueiredo.docsample.adapters.domain.dataprovider.DepartmentRepository
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
