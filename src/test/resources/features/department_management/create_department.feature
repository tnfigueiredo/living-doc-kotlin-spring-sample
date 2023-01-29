Feature: Create Department

  The departments are the organizational level related to major domain areas to handle courses
  managed by MyFictitious Course Center. For administrative purpose, areas can be created, modified or
  deleted according to the company needs.

  Rule To crate a department it is necessary to provide a name and an abbreviation. Name and abbreviation are
  unique information, since both information are needed to identify a department.

  Scenario: Create a department successfully
    Given A department administrator needs a new department
    When department data informed is not duplicated: "New Department", "NDPTO"
    Then a department is created successfully

  Scenario: Fail to create a department with duplicated information
    Given A department administrator needs a new department
    When department information is duplicated for name or abbreviation
    Then department creation operation fails with duplicated information informed