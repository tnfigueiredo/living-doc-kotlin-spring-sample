package com.tnfigueiredo.docsample.bdd.departments

import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User.GeneralUser
import com.tnfigueiredo.docsample.domain.model.UserProfile
import com.tnfigueiredo.docsample.domain.usecases.RemoveDepartmentInformationUseCase
import com.tnfigueiredo.docsample.domain.usecases.SaveDepartmentInformationUseCase
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataIntegrityViolationException


class DepartmentsManagementStepsDefinition {

    @Autowired
    private lateinit var saveDepartmentInformationUseCase: SaveDepartmentInformationUseCase;
    @Autowired
    private lateinit var removeDepartmentInformationUseCase: RemoveDepartmentInformationUseCase

    private var oldDepartment: Department? = null
    private var department: Department? = null
    private lateinit var creator: GeneralUser
    private lateinit var exception: Throwable

    @Given("A department administrator needs a new department")
    fun givenDepartmentAdministratorNeedsNewDepartment(){
        creator = GeneralUser(1, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @Given("A department administrator needs a new department subject")
    fun givenDepartmentAdministratorNeedsNewDepartmentSubject(){
        creator = GeneralUser(1, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @And("There is an existing department already registered: {string}, {string}")
    fun givenOldDepartmentAlreadyRegistered(departmentName: String, departmentAbbreviation: String){
        oldDepartment = saveDepartmentInformationUseCase.execute(
            creator,
            Department(name =  departmentName, abbreviation = departmentAbbreviation, creatorId = creator.id)
        ).getOrNull()
    }

    @And("There is an existing department subject already registered: {string}, {string}")
    fun givenOldDepartmentSubjectAlreadyRegistered(departmentSubjectName: String, departmentSubjectAcronym: String){
        //TODO
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

    @When("department subject data informed is not duplicated: {string}, {string}, {string}")
    fun whenDepartmentSubjectInformationIsNotDuplicated(departmentAbbreviation: String, departmentSubjectName: String, departmentSubjectAcronym: String){
        //TODO
    }

    @When("department subject acronym informed is duplicated: {string}, {string}, {string}")
    fun whenDepartmentSubjectInformationIsDuplicated(departmentAbbreviation: String, departmentSubjectName: String, departmentSubjectAcronym: String){
        //TODO
    }

    @When("department subject acronym in a department is requested to be deactivated: {string}, {string}")
    fun whenDepartmentSubjectInformationIsDeactivated(departmentAbbreviation: String, departmentSubjectAcronym: String){
        //TODO
    }

    @Then("a department is created successfully")
    fun thenDepartmentCreated(){
        assertEquals(department?.name, "New Department")
        assertEquals(department?.abbreviation,  "NDPTO")
        assertEquals(department?.creatorId, creator.id)
    }

    @Then("department creation operation fails with duplicated information informed")
    fun thenDepartmentFailsToBeCreated(){
        assertTrue(exception is DataIntegrityViolationException)
    }

    @Then("a department subject is created successfully")
    fun thenDepartmentSubjectCreated(){
        assertTrue(false)
    }

    @Then("a department subject creation fails")
    fun thenDepartmentSubjectCreationFails(){
        assertTrue(false)
    }

    @Then("a department subject change its status to deactivated")
    fun thenDepartmentSubjectIsDeactivated(){
        //TODO
    }
}
