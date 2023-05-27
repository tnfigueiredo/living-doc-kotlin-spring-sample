Feature: Manage Courses

  The courses management handle operations to created or disable time limited classes are created to be offered to the MyFictitious Course Center students, given an existing subject area into a department.

  **As a** Departament Manager
  **I want to** create a new course
  **So that I can** have a course available into the department to offer to the students

  **As a** Departament Manager
  **I want to** modify a course information
  **So that I can** update a course information into the department to the students

  **As a** Departament Manager
  **I want to** close an existing course
  **So that I can** close a course available into the department that was offered to the students

  Rule: A course can be created if there is no course for a subject between the initial and end date.

    @pending
    Scenario: Create a course successfully
      Given A department administrator needs to manage course information
      And there is an existing course: "MyCourse1", "MyC1", "Programming", "2023-02-18", "2023-06-16"
      When it is informed the course information: "MyCourse2", "MyC2", "Programming", "2023-07-18", "2023-12-16"
      Then a course is created successfully

  Rule: A course fails to be created if there is duplicated information for Abbreviation, or a course for a subject between the initial and end date already exists.

    @pending
    Scenario Outline: Fail to create a course with duplicated information
      Given A department administrator needs to manage course information
      And there is an existing course: "MyCourse1", "MyC1", "Programming", "2023-02-18", "2023-06-16"
      When it is informed the course information: <Name>, <Abbreviation>, <Subject>, <Start Date>, <End Date>
      Then course creation operation fails with duplicated information informed

      Examples:
        | Name        | Abbreviation | Subject       | Start Date   | End Date     |
        | "MyCourse1" | "MyC1"       | "Programming" | "2023-02-18" | "2023-06-16" |
        | "MyCourse2" | "MyC1"       | "Chemistry"   | "2023-02-20" | "2023-06-25" |
        | "MyCourse2" | "MyC2"       | "Programming" | "2023-02-18" | "2023-06-16" |

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