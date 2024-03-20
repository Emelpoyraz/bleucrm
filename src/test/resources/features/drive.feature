Feature: Default

  Background: user already on the homepage
    Given the user logged in as "help desk"
    Then user navigated to "Drive" page


  Scenario: Verify the users view the following 6 modules on the Drive page.
    Given user sees below 6 modules on the "Drive" page.
    |My Drive|
    |All Documents|
    |Company Drive|
    |Sales and Marketing|
    |Top Management's documents|
    |Drive Cleanup|