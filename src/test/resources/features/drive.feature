@Drive
Feature: Default

  Background: user already on the homepage

  Scenario Outline: Verify the users view the following 6 modules on the Drive page.
    Given the user logged in as "<UserType>"
    When user navigates to "Drive" page
    Then user sees below six modules on the Drive page.
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |
    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |