Feature: Link Attachment and Navigation to the specified Url

  Background:
    Given the user is on the login page

    Scenario Outline: Verify user can attach a link to the message
      Given the user logged in as "<UserType>"
      When  the user clicks on the Message tab
      And the user clicks on the Add Link Button
      And the user enters "<LinkText>" and "<Link>"
      And the user clicks on the Save button
      And the user clicks on the Send button
      Then the "<LinkText>" should be displayed on the activity stream
      And the user clicks on the created Link "<LinkText>"
      Then the "<Title>" should be displayed

      Examples:
        | UserType  | LinkText | Link | Title |
        | hr        | clickMe | https://google.com | Google |
        | marketing | hitMe | https://google.com | Google |
        | help desk | pushMe | https://google.com | Google |