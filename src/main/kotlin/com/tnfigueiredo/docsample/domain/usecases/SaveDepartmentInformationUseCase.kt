package com.tnfigueiredo.docsample.domain.usecases

import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User
import org.springframework.stereotype.Component

@Component
class SaveDepartmentInformationUseCase {

    fun execute(user: User, department: Department): Department{
        //TODO - implement
        return department
    }

}