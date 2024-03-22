Feature:

  Background: user is on the homepage

  Scenario Outline: Verify the users view following 8 modules in the Employees page.
    Given the user logged in as "<UserType>"
    When The user clicks the Employees button
    And The user sees the modules Employees

      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |

  Scenario Outline: Verify that user view the Company Structure by clicking the Employees Module
    Given the user logged in as "<UserType>"
    When The user clicks the Employees button
    And The user sees the Company Structure

    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |