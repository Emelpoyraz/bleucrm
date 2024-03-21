@B32G4-105
Feature: Default


  @B32G4-102
  Scenario Outline: Verify User should be able to upload file and pictures
    Given the user with "<userType>" logs in and is on the Active Stream page
    When the user clicks on the Message tab
    Then the user should click on the upload icon
    Then the user should click on upload files and images button
    Then the user uploads "<fileType>" and and see it under upload files and images button

    Examples:

      | userType  | fileType |
      | hr        | pdf      |
      | helpdesk  | txt      |
      | marketing | jpeg     |
      | hr        | png      |
      | helpdesk  | docx     |


  @B32G4-103
  Scenario Outline: Verify user should be able to insert the files and images into the text
    Given Given the "<userType>" successfully uploads a "<fileType>"
    When the user clicks on the insert button to upload the file into message text area
    Then the user should see the file inserted into message text area


    Examples:
      | userType  | fileType |
      | hr        | pdf      |
      | helpdesk  | txt      |
      | marketing | jpeg     |
      | hr        | png      |
      | helpdesk  | docx     |



  @B32G4-104
  Scenario Outline: Verify user should be able to remove files and images at any time before sending
    Given the "<userType>" inserted "<fileType>" successfully into message text area
    When user clicks on the x button
    Then the message content area should not contain the removed "<fileType>"

    Examples:
      | userType  | fileType |
      | hr        | pdf      |
      | helpdesk  | txt      |
      | marketing | jpeg     |
      | hr        | png      |
      | helpdesk  | docx     |