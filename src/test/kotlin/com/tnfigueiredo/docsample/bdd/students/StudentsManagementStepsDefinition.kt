package com.tnfigueiredo.docsample.bdd.students

import com.tnfigueiredo.docsample.domain.model.User.Student
import io.cucumber.java.PendingException
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class StudentsManagementStepsDefinition {

    private lateinit var creator: Student

    @Given("a registered Student is choosing courses")
    fun givenRegisteredStudentChosingCourses(){
        creator = Student(1, "student")
    }

    @And("the Student is already registered in a course:  {string}")
    fun andStudentIsAlreadyRegisteredInCourse(courseCode: String){
        throw PendingException()
    }

    @When("the Student selects the course to enroll: {string}")
    fun whenStudentSelectCourseToEnroll(courseCode: String){
        throw PendingException()
    }

    @Then("the course enrollment is successful")
    fun thenCourseEnrollmentIsSuccessful(){
        throw PendingException()
    }

    @Then("the course enrollment fails")
    fun thenCourseEnrollmentFails(){
        throw PendingException()
    }

}