@companyPage
Feature: Company page verification
  User Story :
  As a user, I should be able to access to the Company page .

  Background: User is already logged in the application home page


  Scenario Outline: Verify users see 7 modules name in the Company page shown as design
    Given the user logged in as "<UserType>"
    When user click on the Company button
    Then user sees the following modules

      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |

    Examples:
      | UserType  |
      | hr        |
      | help desk |
      | marketing |

