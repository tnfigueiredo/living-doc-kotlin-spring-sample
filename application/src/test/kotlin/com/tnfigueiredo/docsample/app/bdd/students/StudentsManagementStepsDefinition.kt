package com.tnfigueiredo.docsample.app.bdd.students

import com.tnfigueiredo.docsample.adapters.domain.model.User.Student
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class StudentsManagementStepsDefinition {

    private lateinit var creator: Student

    @Given("a registered Student from MyFictitious Course Center")
    fun givenRegisteredStudentChosingCourses(){
        creator = Student(1, "student")
    }

    @And("the Student is already registered in a course: {string}")
    fun andStudentIsAlreadyRegisteredInCourse(courseCode: String){
        //TODO Implement
    }

    @When("the Student selects the course to enroll: {string}")
    fun whenStudentSelectCourseToEnroll(courseCode: String){
        //TODO Implement
    }

    @Then("the course enrollment is successful")
    fun thenCourseEnrollmentIsSuccessful(){
        //TODO Implement
    }

    @Then("the course enrollment fails")
    fun thenCourseEnrollmentFails(){
        //TODO Implement
    }

    @And("the Student is registered in the course with code {string} and start date is {string}")
    fun andStudentIsRegisteredInACourse(courseCode: String, courseStartDate: String){
        //TODO Implement
    }

    @When("the Studend request to cancel participation in a course: {string}")
    fun whenStudentSelectCourseToCancel(courseCode: String){
        //TODO Implement
    }

    @Then("the course fails to be cancelled")
    fun thenCourseCancellationFails(){
        //TODO Implement
    }

    @Then("the course is cancelled successfully")
    fun thenCourseIsCancelledSuccessfully(){
        //TODO Implement
    }

    @And("the request date is: {string}")
    fun andStudentRequestDateIs(requestDate: String){
        //TODO Implement
    }
}