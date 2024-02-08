package com.tnfigueiredo.docsample.app.bdd.courses

import com.tnfigueiredo.docsample.adapters.domain.model.User.GeneralUser
import com.tnfigueiredo.docsample.adapters.domain.model.UserProfile
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class CoursesManagementStepsDefinition {

    private lateinit var creator: GeneralUser

    @Given("A department administrator needs to manage course information")
    fun givenDepartmentAdministratorNeedsManageCourseInformation(){
        creator = GeneralUser(1, "dptoAdmin", UserProfile.DEPARTMENT_ADMINISTRATOR)
    }

    @When("it is informed the course information: {string}, {string}, {string}, {string}, {string}")
    fun whenCourseInformationIsInformed(courseName: String, courseCode: String, area: String, startDate: String, endDate: String){
        //TODO Implement
    }

    @When("it is modified the course information: {string}, {string}, {string}, {string}, {string}")
    fun whenCourseInformationIsModified(courseName: String, courseCode: String, area: String, startDate: String, endDate: String){
        //TODO Implement
    }

    @And("there is an existing course: {string}, {string}, {string}, {string}, {string}")
    fun andExistingCourseAvailable(courseName: String, courseCode: String, area: String, startDate: String, endDate: String){
        //TODO Implement
    }

    @When("the course is cancelled at {string}")
    fun whenCourseIsCancelledAt(cancellationDate: String){
        //TODO Implement
    }

    @Then("a course is created successfully")
    fun thenCourseCreatedSuccessfully(){
        //TODO Implement
    }

    @Then("a course is modified successfully")
    fun thenCourseModifiedSuccessfully(){
        //TODO Implement
    }

    @Then("the course is cancelled successfully by department")
    fun thenCourseCreatedSuccessfullyByDepartment(){
        //TODO Implement
    }

    @Then("course creation operation fails with duplicated information informed")
    fun thenCourseFailsToBeCreated(){
        //TODO Implement
    }

    @Then("course cancellation operation by department fails")
    fun thenCourseCancellationFails(){
        //TODO Implement
    }

}