Feature: Course Participation Cancellation

  Sometimes the student needs to suspend or cancel its course participation due to several issues. This results into a course postponement for the next course opening, or even the cancellation of the course for undetermined time.

  **As a** registered Student from MyFictitious Course Center
  **I want to** request a course participation cancellation
  **So that I can** cancel a course enrollment

  **As a** registered Student from MyFictitious Course Center
  **I want to** request a course participation suspension
  **So that I can** postpone a course enrollment

  Background: For a course cancellation
    Given a registered Student from MyFictitious Course Center
    And the Student is registered in the course with code "MYCOURSECODE" and start date is "2022-02-02"

  Rule: To cancel or suspend a course the student must be enrolled.

    @pending
    Scenario: Cancel a course the Student is not enrolled
      When the Studend request to cancel participation in a course: "OTHERCOURSECODE"
      Then the course fails to be cancelled

    @pending
    Scenario: Suspend a course the Student is not enrolled
      When the Studend request to suspend participation in a course: "OTHERCOURSECODE"
      Then the course fails to be suspended

  Rule: To cancel or suspend a course the student must be enrolled in the course and the request date is before the course start date.

    @pending
    Scenario: Cancel a course the Student is enrolled and request date is allowed
      When the Studend request to cancel participation in a course: "MYCOURSECODE"
      And the request date is: "2022-01-16"
      Then the course is cancelled successfully

    @pending
    Scenario: Suspend a course the Student is enrolled and request date is allowed
      When the Studend request to suspend participation in a course: "MYCOURSECODE"
      And the request date is: "2022-01-16"
      Then the course is suspended successfully

  Rule: To cancel or suspend a course the student must be enrolled in the course and the request date is after the course start date.

    @pending
    Scenario: Cancel a course participation the Student is enrolled and request date is not allowed
      When the Studend request to cancel participation in a course: "MYCOURSECODE"
      And the request date is: "2022-02-16"
      Then the course fails to be cancelled

    @pending
    Scenario: Suspend a course participation the Student is enrolled and request date is not allowed
      When the Studend request to suspend participation in a course: "MYCOURSECODE"
      And the request date is: "2022-02-16"
      Then the course fails to be suspended

