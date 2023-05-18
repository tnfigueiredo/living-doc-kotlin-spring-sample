package com.tnfigueiredo.docsample.bdd.courses

import com.tnfigueiredo.docsample.domain.model.User.GeneralUser
import com.tnfigueiredo.docsample.domain.model.UserProfile
import io.cucumber.java.PendingException
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
        throw PendingException()
    }

    @And("there is an existing course: {string}, {string}, {string}, {string}, {string}")
    fun andExistingCourseAvailable(courseName: String, courseCode: String, area: String, startDate: String, endDate: String){
        throw PendingException()
    }

    @When("the course is cancelled at {string}")
    fun whenCourseIsCancelledAt(cancellationDate: String){
        throw PendingException()
    }

    @Then("a course is created successfully")
    fun thenCourseCreatedSuccessfully(){
        throw PendingException()
    }

    @Then("course creation operation fails with duplicated information informed")
    fun thenCourseFailsToBeCreated(){
        throw PendingException()
    }

    @Then("the course is cancelled successfully")
    fun thenCourseCancelledSuccessfully(){
        throw PendingException()
    }

    @Then("course cancellation operation fails")
    fun thenCourseCancellationFails(){
        throw PendingException()
    }

}