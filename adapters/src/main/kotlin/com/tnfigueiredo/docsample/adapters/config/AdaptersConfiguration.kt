package com.tnfigueiredo.docsample.adapters.config

import com.tnfigueiredo.docsample.adapters.dataprovider.DepartmentJpaRepository
import com.tnfigueiredo.docsample.adapters.repositories.DepartmentDomainRepositoryImpl
import com.tnfigueiredo.docsample.domain.repositories.DepartmentDomainRepository
import com.tnfigueiredo.docsample.domain.usecases.RemoveDepartmentInformationUseCase
import com.tnfigueiredo.docsample.domain.usecases.SaveDepartmentInformationUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AdaptersConfiguration {

    @Bean
    fun departmentDomainRepository(
        departmentJpaRepository: DepartmentJpaRepository
    ): DepartmentDomainRepository = DepartmentDomainRepositoryImpl(departmentJpaRepository)

    @Bean
    fun saveDepartmentInformationUseCase(
        departmentDomainRepository: DepartmentDomainRepository
    ): SaveDepartmentInformationUseCase = SaveDepartmentInformationUseCase(departmentDomainRepository)

    @Bean
    fun removeDepartmentInformationUseCase(
        departmentDomainRepository: DepartmentDomainRepository
    ): RemoveDepartmentInformationUseCase = RemoveDepartmentInformationUseCase(departmentDomainRepository)
}