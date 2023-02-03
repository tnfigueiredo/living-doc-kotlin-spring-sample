package com.tnfigueiredo.docsample.bdd.department

import com.tnfigueiredo.docsample.config.CucumberSpringConfiguration
import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User
import com.tnfigueiredo.docsample.domain.model.UserProfile
import com.tnfigueiredo.docsample.domain.usecases.SaveDepartmentInformationUseCase
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import java.sql.SQLIntegrityConstraintViolationException

class DepartmentStepsDefinition: CucumberSpringConfiguration() {

    @Autowired
    private lateinit var saveDepartmentInformationUseCase: SaveDepartmentInformationUseCase;
    lateinit var department: Department
    lateinit var creator: User
    lateinit var exception: Exception

    @Given("A department administrator needs a new department")
    fun givenDepartmentAdministratorNeedsNewDepartment(){
        creator = User(1, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @When("department data informed is not duplicated: {string}, {string}")
    fun whenDepartmentInformationIsNotDuplicated(departmentName: String, departmentAbbreviation: String){
        department = saveDepartmentInformationUseCase.execute(creator, Department(null, departmentName, departmentAbbreviation, creator.id))
    }

    @When("department information is duplicated for name: {string}, {string}")
    fun whenDepartmentInformationIsDuplicatedForName(departmentName: String, departmentAbbreviation: String){
        try {
            saveDepartmentInformationUseCase.execute(creator, Department(null, departmentName, departmentAbbreviation, creator.id))
        } catch (e: Exception) {
            exception = e
        }
    }

    @When("department information is duplicated for abbreviation: {string}, {string}")
    fun whenDepartmentInformationIsDuplicatedForAbbreviation(departmentName: String, departmentAbbreviation: String){
        assertTrue(false)
    }

    @Then("a department is created successfully")
    fun thenDepartmentCreated(){
        assertEquals(department, Department(1, "New Department", "NDPTO", creator.id))
    }

    @Then("department creation operation fails with duplicated information informed")
    fun thenDepartmentFailsToBeCreated(){
        assertTrue(exception is SQLIntegrityConstraintViolationException)
    }
}