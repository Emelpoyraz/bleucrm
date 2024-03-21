@wip
Feature: Message Sending in Active Stream


  Scenario Outline: Sending Message with Mandatory Fields
    Given the user with username "<username>" and password "<password>" is on the Active Stream page
    When the user clicks on the Message tab
    Then the user should see fields for Message Content
    And the user should see All employees by default as Recipient
    And the user enters "message" in the message content field
    And clicks on the send button
    Then the message should be sent successfully to the specified recipient(s)

    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing1@cydeo.com | UserUser |


  Scenario Outline: Error Messages for Mandatory Fields
    Given the user with username "<username>" and password "<password>" is on the Active Stream page
    When the user clicks on the Message tab
    And the user tries to send a message without filling mandatory field of message content area
    Then title error message "The message title is not specified" should be displayed
    And the user tries to send a message without filling mandatory field of recipient area
    Then recipient error message "Please specify at least one person." should be displayed

    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing1@cydeo.com | UserUser |


  Scenario Outline: Cancel sending a message before sending
    Given the user with username "<username>" and password "<password>" is on the Active Stream page
    When the user clicks on the Message tab
    And the user should see fields for Message Content
    Then the user should see All employees by default as Recipient
    And the user enters "message" in the message content field
    When user clicks on the "cancelButton" button before sending the message
    Then message should not be sent

    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing1@cydeo.com | UserUser |

     #PLEASE rearrange your code that will match below :
    #As Leena mentioned at the daily meeting (20/03/2024 8pm CET) credentials cannot be shared in the feature files.
    #AFTER YOU MANAGED YOUR FILE, DELETE THIS COMMENTS AND PUSH YOUR CODES AGAIN.

    #  Scenario Outline: Sending Message with Mandatory Fields
    #    Given the user logged in as "<UserType>"
    #    When the user clicks on the Message tab
    #    Then the user should see fields for Message Content
    #    And the user should see All employees by default as Recipient
    #    And the user enters "message" in the message content field
    #    And clicks on the send button
    #    Then the message should be sent successfully to the specified recipient(s)
    #
    #    Examples:
    #      | UserType  |
    #      | hr        |
    #      | help desk |
    #      | marketing |
    #
    #
    #  Scenario Outline: Error Messages for Mandatory Fields
    #    Given the user logged in as "<UserType>"
    #    When the user clicks on the Message tab
    #    And the user tries to send a message without filling mandatory field of message content area
    #    Then title error message "The message title is not specified" should be displayed
    #    And the user tries to send a message without filling mandatory field of recipient area
    #    Then recipient error message "Please specify at least one person." should be displayed
    #
    #    Examples:
    #      | UserType  |
    #      | hr        |
    #      | help desk |
    #      | marketing |
    #
    #
    #  Scenario Outline: Cancel sending a message before sending
    #    Given the user logged in as "<UserType>"
    #    When the user clicks on the Message tab
    #    And the user should see fields for Message Content
    #    Then the user should see All employees by default as Recipient
    #    And the user enters "message" in the message content field
    #    When user clicks on the "cancelButton" button before sending the message
    #    Then message should not be sent
    #
    #    Examples:
    #      | UserType  |
    #      | hr        |
    #      | help desk |
    #      | marketing |
