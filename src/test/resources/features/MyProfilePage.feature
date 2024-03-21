@B32G4-100
Feature: Default


  @B32G4-98
  Scenario: As a user, I should be able to access My Profile page

  Scenario: Profile page options verification
    Given the user logged in as "<userType>"
    Given the user logged in with username as "hr16@cydeo.com" and password as "UserUser"
    When user click to user account name
    And user clicks to "my profile" option
    Then user sees the following options
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |


  @B32G4-99
  Scenario: As a user, I should be able to access My Profile page

  Scenario: Same email address displayed as user account
    Given the user logged in as "<userType>"
    Given the user logged in with username as "helpdesk78@cydeo.com" and password as "UserUser"
    When user click to user account name
    And user clicks to "my profile" option
    Then the user verify that the displayed "helpdesk78@cydeo.com" is the same as the user's account

   #PLEASE rearrange your code that will match below :
    #As Leena mentioned at the daily meeting (20/03/2024 8pm CET) credentials cannot be shared in the feature files.
    #AFTER YOU MANAGED YOUR FILE, DELETE THIS COMMENTS AND PUSH YOUR CODES AGAIN.
          #  @B32G4-98
          #  Scenario Outline: As a user, I should be able to access My Profile page_Profile page options verification
          #    Given the user logged in as "<UserType>"
          #    When user click to user account name
          #    And user clicks to "my profile" option
          #    Then user sees the following options
          #      | General       |
          #      | Drive         |
          #      | Tasks         |
          #      | Calendar      |
          #      | Conversations |
          #    Examples:
          #      | UserType  |
          #      | hr        |
          #      | help desk |
          #      | marketing |
          #
          #
          #  @B32G4-99
          #  Scenario Outline: As a user, I should be able to access My Profile page_Same email address displayed as user account
          #    Given the user logged in as "<UserType>"
          #    When user click to user account name
          #    And user clicks to "my profile" option
          #    Then the user verify that the displayed "username" is the same as the user's account
          #
          #    Examples:
          #      | UserType  |
          #      | hr        |
          #      | help desk |
          #      | marketing |