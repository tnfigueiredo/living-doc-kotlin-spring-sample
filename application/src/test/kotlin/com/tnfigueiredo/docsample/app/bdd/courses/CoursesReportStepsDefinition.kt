package com.tnfigueiredo.docsample.app.bdd.courses

import com.tnfigueiredo.docsample.domain.model.User.GeneralUser
import com.tnfigueiredo.docsample.domain.model.UserProfile
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class CoursesReportStepsDefinition {

    private lateinit var creator: GeneralUser

    @Given("a department administrator needs a new report")
    fun givenDepartmentAdministratorNeedsANewReport(){
        creator = GeneralUser(1, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @Given("a department employee needs a new report")
    fun givenDepartmentEmployeeNeedsANewReport(){
        creator = GeneralUser(1, "dptoAdmin", UserProfile.DEPARTMENT_EMPLOYEE)
    }

    @When("a report for the {string} courses is requested")
    fun whenReportForDepartmentIsRequested(departmentCode: String){
        //TODO Implement
    }

    @Then("report having students by course is returned")
    fun thenReportIsReturned(){
        //TODO Implement
    }

}