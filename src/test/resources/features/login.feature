@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<UserType>"
    #userTypes: hr, help desk, marketing
    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |





