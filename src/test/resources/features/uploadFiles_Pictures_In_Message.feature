@wip_ebuu
Feature: Default

  Scenario Outline: Verify User should be able to upload file and pictures
    Given the user logged in as "<userType>"
    When the user clicks on the message tab
    Then the user should click on the upload icon
    Then the user should click on upload files and images button
    Then the user uploads the below files
      | exampleDocxFile.docx |
      | exampleJpegFile.jpg  |
      | examplePdfFile.pdf   |
      | examplePngFile.png   |
      | exampleTxtFile.txt   |

    Examples:

      | userType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline: Verify user should be able to insert the files and images into the text
    Given the user logged in as "<userType>"
    When the user clicks on the message tab
    Then the user should click on the upload icon
    Then the user should click on upload files and images button
    Then the user uploads the below files
      | exampleDocxFile.docx |
      | exampleJpegFile.jpg  |
      | examplePdfFile.pdf   |
      | examplePngFile.png   |
      | exampleTxtFile.txt   |
    Given below files are successfully uploaded
      | exampleDocxFile.docx |
      | exampleJpegFile.jpg  |
      | examplePdfFile.pdf   |
      | examplePngFile.png   |
      | exampleTxtFile.txt   |

    Then the user uploads the below fileTypes into message text area
      | exampleDocxFile.docx |
      | exampleJpegFile.jpg  |
      | examplePdfFile.pdf   |
      | examplePngFile.png   |
      | exampleTxtFile.txt   |

    Examples:

      | userType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline: Verify user should be able to remove files and images at any time before sending
    Given the user logged in as "<userType>"
    When the user clicks on the message tab
    Then the user should click on the upload icon
    Then the user should click on upload files and images button
    Then the user uploads the below fileTypes into message text area
      | exampleDocxFile.docx |
      | exampleJpegFile.jpg  |
      | examplePdfFile.pdf   |
      | examplePngFile.png   |
      | exampleTxtFile.txt   |
    Then user clicks insert in text button
    When user clicks on the x button
    Then the message content area should not contain the below removed fileTypes
      | exampleDocxFile.docx |
      | exampleJpegFile.jpg  |
      | examplePdfFile.pdf   |
      | examplePngFile.png   |
      | exampleTxtFile.txt   |

    Examples:

      | userType  |
      | hr        |
      | help desk |
      | marketing |
