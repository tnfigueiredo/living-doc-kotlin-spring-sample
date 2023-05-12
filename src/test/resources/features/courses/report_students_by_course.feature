Feature: Report Students By Course

  The departments needs to understand how many students they have by course to check how they need to manage courses and subjects in the department.

  **As a** Departament Manager
  **I want to** get a report of students by course for a department
  **So that I can** have information of numbers of students by course from a department

  Scenario: Request students by course report
    Given A department administrator/employee needs a new report
    When a report for the "NDPTO" courses is requested
    Then report having stuents by course is returned