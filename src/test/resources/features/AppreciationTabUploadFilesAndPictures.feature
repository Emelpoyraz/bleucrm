@appreciationUpload
Feature: As a user, I should be able to upload files and pictures to appreciation


  Scenario Outline: Verify that the <UserType> can upload <fileType>.
    When user logs in as "<UserType>"
    And user clicks "Activity Stream"
    And user clicks "More" in activity stream
    And user clicks "Appreciation" under more in activity stream
    And user enter a message "Appreciation"
    And user clicks attachment button
    And user upload the files"<fileType>"
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


