
Feature: Company Structure functions
  Agile story:As a user, I should be able to use functions on Company Structure under Employee menu


  Scenario Outline: Company Structure visibility
    Given the user logged in as "<UserType>"
    When user click on Employees page
    Then user sees the Company Structure module displayed

    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline: Add Department button displayed for Hr user
    Given the user logged in as "<UserType>"
    When user click on Employees page
    Then the hr user sees the ADD DEPARTMENT button displayed

    Examples:
      | UserType  |
      | hr        |



  Scenario Outline: Add Department button not displayed for help desk and marketing users
    Given the user logged in as "<UserType>"
    When user click on Employees page
    Then the help desk user does not see the ADD DEPARTMENT button displayed
    Then the marketing user does not see the ADD DEPARTMENT button displayed


    Examples:
      | UserType  |
      | help desk |
      | marketing |

