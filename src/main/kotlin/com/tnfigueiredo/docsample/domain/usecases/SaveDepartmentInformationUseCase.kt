package com.tnfigueiredo.docsample.domain.usecases

import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User
import com.tnfigueiredo.docsample.domain.ports.DepartmentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class SaveDepartmentInformationUseCase {

    @Autowired
    private lateinit var departmentRepository: DepartmentRepository
    fun execute(user: User, department: Department): Department{
        val departmentRecovered =  departmentRepository.findByName(department.name)
        if(departmentRecovered != null){throw Exception("error")}
        return departmentRepository.saveAndFlush(department.copy(creatorId = user.id))
    }

}