@B32G4-6
Feature:Activity stream page functionality
  Agile Story: As a user, I should be able to see all the options on the Activity stream page


  Scenario: user sees all options on Activity stream page
    Given user is on the homepage
    When user sees below five options on Activity stream page
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |
    And user clicks more option button
    Then user sees below four MoreOptions under the MORE tab
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |