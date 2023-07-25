Feature: Deactivate Department Subject

  The departments management handles the deactivation of department subjects information related to the MyFictitious Course Center courses. Subjects deactivated are not
  available to new courses creation and they are used only for historical information.

  **As a** Departament Manager
  **I want to** deactivate an existing department subject
  **So that I can** disable a subject not used by the department anymore

  Rule: When deactivating a department subject, the department subject change its status to not active.

    @pending
    Scenario: Deactivate a department subject successfully
      Given A department administrator needs a new department subject
      And There is an existing department subject already registered: "OLDDPTO", "OLDSUBJECT"
      When department subject acronym in a department is requested to be deactivated: "OLDDPTO", "OLDSUBJECT"
      Then a department subject change its status to deactivated