Feature: Cancel Courses

  **As a** Departament Manager
  **I want to** cancel an existing course
  **So that I can** make a course not available anymore into the department

  Rule: A course can be canceled if the cancellation date is before its start date.

    @pending
    Scenario: Course is cancelled successfully
      Given A department administrator needs to manage course information
      And there is an existing course: "MyCourse1", "MyC1", "Programming", "2023-02-18", "2023-06-16"
      When the course is cancelled at "2023-02-17"
      Then the course is cancelled successfully by department

  Rule: A course cannot be canceled if the cancellation date is from its start date on.

    @pending
    Scenario Outline: Fail to cancel a course with invalid cancellation date information
      Given A department administrator needs to manage course information
      And there is an existing course: "MyCourse1", "MyC1", "Programming", "2023-02-18", "2023-06-16"
      When the course is cancelled at <Cancellation Date>
      Then course cancellation operation by department fails

      Examples:
        | Cancellation Date   |
        | "2023-02-18" |
        | "2023-02-20" |