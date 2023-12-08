Feature: Create Department Subject

  The departments management handles the creation of department subjects information related to the MyFictitious Course Center courses. Subjects are a way to group
  departments course for common topics.

  **As a** Departament Manager
  **I want to** create a new department subject
  **So that I can** have a department subject to group courses

  Background: For creating a department subject
    Given A department administrator needs a new department subject
    And There is an existing department subject already registered: "OLDDPTO", "OLDSUBJECT"

  Rule: To crate a department subject it is necessary to provide an acronym and a description. Acronym ia a unique information inside a department, since it is used to identify a department subject.

    Scenario: Create a department subject successfully
      When department subject data informed is not duplicated: "OLDDPTO", "NEWSUBJECT", "New Subject"
      Then a department subject is created successfully

  Rule: When creating a department subject with duplicated acronym, the department subject creation should fail.

    Scenario: Create a department subject duplicated fail
      When department subject acronym informed is duplicated: "OLDDPTO", "OLDSUBJECT", "New Subject"
      Then a department subject creation fails