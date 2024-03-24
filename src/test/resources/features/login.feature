@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<UserType>"
    #userTypes: hr, help desk, marketing
    Then user lands on the "<homepage>" successfully
    Examples:
      | UserType  | homepage    |
      | hr        | homepageUrl |
      | help desk | homepageUrl |
      | marketing | homepageUrl |

  @login2
  Scenario Outline: Verify that "Incorrect login or password" error message is displayed for invalid  credentials.
    When user logged in with username as "<username>" and password as "<password>"
    Then user should be able to see error message "Incorrect login or password"
    Examples:
      | username      | password         |
      | valid email   | invalid password |
      | invalid email | valid password   |
      | invalid email | invalid password |

  @login3
  Scenario Outline: Verify "Please fill out this field" error message is displayed if the password or username is empty
    When user logged in with username as "<username>" and password as "<password>"
    Then user should be able to see error message "Please fill out this field"
    Examples:
      | username | password    |
      | email    | no password |
      | no email | password    |
      | no email | no password |

  @login4
  Scenario: Verify that the "Remember me on this computer" link exists
    Then user should be able to see remember me box

  @login5
  Scenario: Verify that the "Remember me on this computer"  is clickable
    When user clicks Remember me checkbox
    Then user should be able to see Remember me checkbox clicked

  @login6
  Scenario: Verify that the password is in bullet signs by default.
    Then user should be able to see password is in bullet signs by default




