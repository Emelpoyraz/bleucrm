@logout
Feature: Users should be able to logout

  Background: User is already in the log in page
    Given the user is on the login page


  @wip
  Scenario: User is able to logout
    Given the user logged in as "<userType>"
    Given the user logged in with username as "hr16@cydeo.com" and password as "UserUser"
    When The user clicks the userName button
    And The user clicks the logout button

  @wip
  Scenario: Verify users see 5 options under the profile name.
    Given the user logged in as "<userType>"
    Given the user logged in with username as "hr16@cydeo.com" and password as "UserUser"
    When The user clicks the userName button
    Then The User sees below list

      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |