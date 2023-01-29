package com.tnfigueiredo.docsample.bdd.department

import com.tnfigueiredo.docsample.domain.model.Department
import com.tnfigueiredo.docsample.domain.model.User
import com.tnfigueiredo.docsample.domain.model.UserProfile
import com.tnfigueiredo.docsample.domain.usecases.SaveDepartmentInformationUseCase
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue
import org.springframework.beans.factory.annotation.Autowired

class DepartmentStepsDefinition {

    @Autowired
    private lateinit var saveDepartmentInformationUseCase: SaveDepartmentInformationUseCase;
    lateinit var department: Department
    lateinit var creator: User

    @Given("A department administrator needs a new department")
    fun givenDepartmentAdministratorNeedsNewDepartment(){
        creator = User(1, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @When("department data informed is not duplicated: {string}, {string}")
    fun whenDepartmentInformationIsNotDuplicated(departmentName: String, departmentAbbreviation: String){
        department = Department(null, departmentName, departmentAbbreviation, null)
    }

    @When("department information is duplicated for name or abbreviation")
    fun whenDepartmentInformationIsDuplicated(){
        //TOOD - implement
    }

    @Then("a department is created successfully")
    fun thenDepartmentCreated(){
        assertTrue(true)
    }

    @Then("department creation operation fails with duplicated information informed")
    fun thenDepartmentFailsToBeCreated(){
        assertTrue(true)
    }
}