@B32G4-105
Feature: Default


  @B32G4-102
  Scenario Outline: Verify User should be able to upload file and pictures
    Given the user logged in as "<userType>"
    When the user clicks on the "message" tab
    Then the user should click on the upload icon
    Then the user should click on upload files and images button
    Then the user uploads the below files

      | klm.pdf  |
      | abc.txt  |
      | lololo.jpeg |
      | hohoh.png  |
      | hopla.docx |

    Examples:

      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |



  @B32G4-103
  Scenario Outline: Verify user should be able to insert the files and images into the text
    Given the user logged in as "<userType>"
    When the user clicks on the "message" tab
    Then the user should click on the upload icon
    Then the user should click on upload files and images button
    Given Given the "<userType>" successfully uploads a "fileType"
    Then the user clicks on the insert button to upload the below fileTypes into message text area

      | pdf  |
      | txt  |
      | jpeg |
      | png  |
      | docx |

    Examples:

      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  @B32G4-104
  Scenario Outline: Verify user should be able to remove files and images at any time before sending
    Given the "<userType>" inserted below fileTypes successfully into message text area
    When user clicks on the x button
    Then the message content area should not contain the below removed fileTypes

      | pdf  |
      | txt  |
      | jpeg |
      | png  |
      | docx |


    Examples:

      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |