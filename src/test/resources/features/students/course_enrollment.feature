Feature: Course Enrollment

  Once a Student is registered in MyFictitious Course Center, it has the responsibility to select the courses to join into its learning process.

  **As a** registered Student from MyFictitious Course Center
  **I want to** enroll to a new course
  **So that I can** be guaranteed a place to attend classes

  Background: For student course enrollment
    Given a registered Student from MyFictitious Course Center
    And the Student is already registered in a course: "COURSECODE"

  Rule: To enroll in a course the student must not have already subscribed to it

    @pending
    Scenario: Enroll in a course successfully
      When the Student selects the course to enroll: "NEWCOURSE"
      Then the course enrollment is successful

  Rule: To enroll in a course the student is already subscribed to

    @pending
    Scenario: Enroll in a course fails
      When the Student selects the course to enroll: "COURSECODE"
      Then the course enrollment fails