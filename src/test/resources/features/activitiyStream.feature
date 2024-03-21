@B32G4-97
Feature: Default


  @B32G4-95
  Scenario Outline: Verify user sees all five options on the Activity Stream Page
    Given the user logged in as "<UserType>"
    When user sees below five options on Activity stream page
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |
    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |


  @B32G4-96
  Scenario Outline: Verify user sees all four options under the "MORE" tab
    Given the user logged in as "<UserType>"
    And user clicks more option button
    Then user sees below four MoreOptions under the MORE tab
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |
    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |