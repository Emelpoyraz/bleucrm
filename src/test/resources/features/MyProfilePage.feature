@B32G4-100
Feature: Default


  @B32G4-98
  Scenario: As a user, I should be able to access My Profile page

  Scenario Outline: Profile page options verification
    Given the user logged in as "<UserType>"
    When user click to user account name
    And user clicks to my profile option
    Then user sees the following options
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |


  @B32G4-99
  Scenario: As a user, I should be able to access My Profile page

  Scenario Outline: Same email address displayed as user account
    Given the user logged in as "<UserType>"
    When user click to user account name
    And user clicks to my profile option
    Then the user verify that the displayed "<username>" is the same as the user's account


    Examples:
      | UserType  | username             |
      | hr        | hr1@cydeo.com        |
      | help desk | helpdesk1@cydeo.com  |
      | marketing | marketing1@cydeo.com |
