
Feature: As a user, I should be able to upload files and pictures to appreciation

  Acceptance Criteria:
  1. User should be able to upload file and pictures.
  Supported file formats .pdf, .txt, .jpeg, .png, .docx
  2. User should be able to insert the files and images into the text
  3. User should be able to remove files and images at any time before sending.

@AC1
  Scenario Outline: Verify that the <UserType> can upload <fileType>.
    When the user logged in as "<UserType>"
    And user clicks "Activity Stream"
    And user clicks More in activity stream
    And user clicks "Appreciation" under more in activity stream
    And user enter a message "Appreciation"
    And user clicks attachment button
    And user upload the files "<fileType>"
    Then user should be able to see "<fileType>" in the uploaded files

    Examples:
      | UserType  | fileType             |
      | hr        | exampleDocxFile.docx |
      | hr        | examplePdfFile.pdf   |
      | hr        | exampleTxtFile.txt   |
      | hr        | exampleJpegFile.jpg  |
      | hr        | examplePngFile.png   |
      | help desk | exampleDocxFile.docx |
      | help desk | examplePdfFile.pdf   |
      | help desk | exampleTxtFile.txt   |
      | help desk | exampleJpegFile.jpg  |
      | help desk | examplePngFile.png   |
      | marketing | exampleDocxFile.docx |
      | marketing | examplePdfFile.pdf   |
      | marketing | exampleTxtFile.txt   |
      | marketing | exampleJpegFile.jpg  |
      | marketing | examplePngFile.png   |

@AC2
  Scenario Outline: Verify that the <userType> can insert the <fileType>into the text.
    When the user logged in as "<UserType>"
    And user clicks "Activity Stream"
    And user clicks More in activity stream
    And user clicks "Appreciation" under more in activity stream
    And user enter a message "Appreciation"
    And user clicks attachment button
    And user upload the files "<fileType>"
    And user clicks insert in text button
    Then user should be able to see "<fileType>" in the message
    Examples:
      | UserType  | fileType             |
      | hr        | exampleDocxFile.docx |
      | hr        | examplePdfFile.pdf   |
      | hr        | exampleTxtFile.txt   |
      | hr        | exampleJpegFile.jpg  |
      | hr        | examplePngFile.png   |
      | help desk | exampleDocxFile.docx |
      | help desk | examplePdfFile.pdf   |
      | help desk | exampleTxtFile.txt   |
      | help desk | exampleJpegFile.jpg  |
      | help desk | examplePngFile.png   |
      | marketing | exampleDocxFile.docx |
      | marketing | examplePdfFile.pdf   |
      | marketing | exampleTxtFile.txt   |
      | marketing | exampleJpegFile.jpg  |
      | marketing | examplePngFile.png   |

  @AC3
  Scenario Outline: Verify that the <userType> can remove <fileType> at any time before sending.
    When the user logged in as "<UserType>"
    And user clicks "Activity Stream"
    And user clicks More in activity stream
    And user clicks "Appreciation" under more in activity stream
    And user enter a message "Appreciation"
    And user clicks attachment button
    And user upload the files "<fileType>"
    And user clicks RemoveDelete button
    Then user should not be able to see "<fileType>" in the uploaded files
    Examples:
      | UserType  | fileType                 |
      | hr        | exampleDocxFile.docx |
      | hr        | examplePdfFile.pdf   |
      | hr        | exampleTxtFile.txt   |
      | hr        | exampleJpegFile.jpg  |
      | hr        | examplePngFile.png   |
      | help desk | exampleDocxFile.docx |
      | help desk | examplePdfFile.pdf   |
      | help desk | exampleTxtFile.txt   |
      | help desk | exampleJpegFile.jpg  |
      | help desk | examplePngFile.png   |
      | marketing | exampleDocxFile.docx |
      | marketing | examplePdfFile.pdf   |
      | marketing | exampleTxtFile.txt   |
      | marketing | exampleJpegFile.jpg  |
      | marketing | examplePngFile.png   |



