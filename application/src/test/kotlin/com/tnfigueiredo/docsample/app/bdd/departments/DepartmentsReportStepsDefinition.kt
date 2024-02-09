package com.tnfigueiredo.docsample.app.bdd.departments

import com.tnfigueiredo.docsample.domain.model.User.GeneralUser
import com.tnfigueiredo.docsample.domain.model.UserProfile
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class DepartmentsReportStepsDefinition {

    private lateinit var creator: GeneralUser

    @Given("a department employee needs course information by department")
    fun givenDepartmentEmployeeNeedsNewDepartment(){
        creator = GeneralUser(2, "dptoWorker", UserProfile.DEPARTMENT_EMPLOYEE)
    }

    @Given("a department department employee needs course information by department")
    fun givenDepartmentAdministratorNeedsNewDepartment(){
        creator = GeneralUser(2, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @When("the Courses by Department information is requested")
    fun whenCoursesByDepartmentIsRequested(){
        //TODO Implement
    }

    @Then("the department report information with courses is returned")
    fun thenDepartmentReportReturned(){
        //TODO Implement
    }

}