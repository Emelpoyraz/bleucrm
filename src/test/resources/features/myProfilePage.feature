Feature: Profile page verification
  User Story: As a user, I should be able to access My Profile page


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


    @biu
    Scenario: Same email address displayed as user account
      Given the user logged in as "<userType>"
      Given the user logged in with username as "helpdesk78@cydeo.com" and password as "UserUser"
      When user click to user account name
      And user clicks to "my profile" option
      Then the user verify that the displayed "helpdesk78@cydeo.com" is the same as the user's account