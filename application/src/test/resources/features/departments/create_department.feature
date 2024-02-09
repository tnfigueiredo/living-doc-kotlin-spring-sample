Feature: Create Department

  The departments are created to manage subject and courses information related to the MyFictitious Course Center. Everytime new areas are integrated to the company, new departments are created.

  **As a** Departament Manager
  **I want to** create a new department
  **So that I can** have a department to manage subjects and courses

  Background: For creating a department
    Given A department administrator needs a new department
    And There is an existing department already registered: "Old Department", "OLDDPTO"

  Rule: To crate a department it is necessary to provide a name and an abbreviation. Name and abbreviation are unique information, since both information are needed to identify a department.

    Scenario: Create a department successfully
      When department data informed is not duplicated: "New Department", "NDPTO"
      Then a department is created successfully

  Rule: When creating a department with duplicated name or abbreviation, the department creation should fail.

    Scenario Outline: Fail to create a department with duplicated name information
      When department information is duplicated: <Name>, <Abbreviation>
      Then department creation operation fails with duplicated information informed

      Examples:
        | Name                | Abbreviation |
        | "Old Department"    | "NDPTONEW"   |
        | "My New Department" | "NDPTO"      |