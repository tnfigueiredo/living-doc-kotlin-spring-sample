Feature: Report Courses by Department

  For managing the departments information it is necessary to have information related to how many courses each department handles.
  This is an entry point to understand how many professionals and professors a department needs.

  Scenario: Courses by Department report created successfully
    Given A department manager or a department employee
    When The Courses by Department information is requested
    Then The department report information with courses is returned