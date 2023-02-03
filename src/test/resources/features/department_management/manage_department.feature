Feature: Manage Department

  The departments are the organizational level related to major domain areas to handle courses
  managed by MyFictitious Course Center. For administrative purpose, areas can be created, modified or
  deleted according to the company needs.

  Rule: To crate a department it is necessary to provide a name and an abbreviation. Name and abbreviation are unique information, since both information are needed to identify a department.

    Background: For creating a department
      Given A department administrator needs a new department
      And There is an existing department already registered: "Old Department", "OLDDPTO"

    Scenario: Create a department successfully
      When department data informed is not duplicated: "New Department", "NDPTO"
      Then a department is created successfully

    Scenario Outline: Fail to create a department with duplicated name information
      When department information is duplicated: <Name>, <Abbreviation>
      Then department creation operation fails with duplicated information informed

      Examples:
        | Name                | Abbreviation |
        | "Old Department"    | "NDPTONEW"   |
        | "My New Department" | "NDPTO"      |

