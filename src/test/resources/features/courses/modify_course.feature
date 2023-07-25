Feature: Modify Courses

  **As a** Departament Manager
  **I want to** modify a course information
  **So that I can** update a course information into the department to the students

  Rule: A course can be modified if there is no course for a subject between the initial and end date, and no repeated course abbreviation.

    @pending
    Scenario: Modify a course successfully
      Given A department administrator needs to manage course information
      And there is an existing course: "MyCourse1", "MyC1", "Programming", "2023-02-18", "2023-06-16"
      When it is modified the course information: "MyCourse2", "MyC1", "Programming", "2023-07-18", "2023-12-16"
      Then a course is modified successfully