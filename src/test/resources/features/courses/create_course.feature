Feature: Create Courses

  **As a** Departament Manager
  **I want to** create a new course
  **So that I can** have a course available into the department to offer to the students

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