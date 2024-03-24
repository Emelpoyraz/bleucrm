@appreciationMessage
Feature: Sending Appreciation in Activity Stream
  User story:
  As a user, I should be able to send appreciation by clicking on Appreciation tab in the Activity Stream.

  Background: User is already logged in the application home page
    Given the user logged in as "hr"


  @appreciation
  Scenario: User sends appreciation by filling in the mandatory fields
    Given the user is on the Activity Stream page
    When the user clicks on the Appreciation tab
    And enter "appreciated message" in the message content area
    And clicks on the Send button
    Then the appreciation is sent successfully

@errorMessage
  Scenario: User sends appreciation with error message for mandatory fields
    Given the user is on the Activity Stream page
    When the user clicks on the Appreciation tab
    And send appreciation without filling in the message content area
    Then "The message title is not specified." error message displayed
    And the user send appreciation without filling recipient area
    Then "Please specify at least one person." error message is displayed

@allEmployees
  Scenario: Appreciation delivery is 'All employees' by default
    Given the user is on the Activity Stream page
    When the user clicks on the Appreciation tab
    Then All employees is selected by default
@cancelMessage
  Scenario: User cancels sending appreciation
    Given the user is on the Activity Stream page
    When the user clicks on the Appreciation tab
    And fills in the mandatory fields
    And clicks on the Cancel button
    Then the appreciation sending process is canceled