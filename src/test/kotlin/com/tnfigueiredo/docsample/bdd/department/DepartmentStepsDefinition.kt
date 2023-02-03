package com.tnfigueiredo.docsample.bdd.department

import com.tnfigueiredo.docsample.config.CucumberSpringConfiguration
import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User
import com.tnfigueiredo.docsample.domain.model.UserProfile
import com.tnfigueiredo.docsample.domain.usecases.RemoveDepartmentInformationUseCase
import com.tnfigueiredo.docsample.domain.usecases.SaveDepartmentInformationUseCase
import io.cucumber.java.After
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataIntegrityViolationException

class DepartmentStepsDefinition: CucumberSpringConfiguration() {

    @Autowired
    private lateinit var saveDepartmentInformationUseCase: SaveDepartmentInformationUseCase;
    @Autowired
    private lateinit var removeDepartmentInformationUseCase: RemoveDepartmentInformationUseCase
    lateinit var department: Department
    lateinit var oldDepartment: Department
    lateinit var creator: User
    lateinit var exception: Throwable

    @After
    fun removeOldDepartment(){
        removeDepartmentInformationUseCase.execute(oldDepartment)
    }

    @Given("A department administrator needs a new department")
    fun givenDepartmentAdministratorNeedsNewDepartment(){
        creator = User(1, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @Given("There is an existing department already registered: {string}, {string}")
    fun givenOldDepartmentAlreadyRegistered(departmentName: String, departmentAbbreviation: String){
        oldDepartment = saveDepartmentInformationUseCase.execute(
            creator,
            Department(name =  departmentName, abbreviation = departmentAbbreviation, creatorId = creator.id)
        ).getOrNull()!!
    }

    @When("department data informed is not duplicated: {string}, {string}")
    fun whenDepartmentInformationIsNotDuplicated(departmentName: String, departmentAbbreviation: String){
        department = saveDepartmentInformationUseCase.execute(
            creator, Department(name =  departmentName, abbreviation = departmentAbbreviation, creatorId = creator.id)
        ).getOrNull()!!
    }

    @When("department information is duplicated: {string}, {string}")
    fun whenDepartmentInformationIsDuplicated(departmentName: String, departmentAbbreviation: String){
        exception = saveDepartmentInformationUseCase.execute(
            creator,
            Department(name =  departmentName, abbreviation = departmentAbbreviation, creatorId = creator.id)
        ).exceptionOrNull()!!
    }

    @Then("a department is created successfully")
    fun thenDepartmentCreated(){
        assertEquals(department.name, "New Department")
        assertEquals(department.abbreviation,  "NDPTO")
        assertEquals(department.creatorId, creator.id)
    }

    @Then("department creation operation fails with duplicated information informed")
    fun thenDepartmentFailsToBeCreated(){
        assertTrue(exception is DataIntegrityViolationException)
    }
}
