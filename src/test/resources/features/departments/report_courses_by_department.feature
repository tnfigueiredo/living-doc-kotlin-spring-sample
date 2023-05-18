Feature: Report Courses by Department

  For managing the departments information it is necessary to have information related to how many courses each department handles.
  This is an entry point to understand how many professionals and professors a department needs.

  Scenario: Courses by Department report created successfully by Department Manager
    Given a department department employee needs course information by department
    When the Courses by Department information is requested
    Then the department report information with courses is returned

  Scenario: Courses by Department report created successfully by Department Employee
    Given a department employee needs course information by department
    When the Courses by Department information is requested
    Then the department report information with courses is returned