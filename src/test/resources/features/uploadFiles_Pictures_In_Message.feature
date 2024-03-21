@B32G4-105
Feature: Default

	
	@B32G4-102
	Scenario Outline: Verify User should be able to upload file and pictures (Supported file formats .pdf, .txt, .jpeg, .png, .docx)
		Given the user with username "<username>" and with password "UserUser" logs in and is on the Active Stream page
		    When the user clicks on the Message tab
		    Then the user should see and click on the upload icon
		    Then the user should see and click on upload files and images button
		    Then the user should be able to upload a supported "<fileType>" and and see it under upload files and images button
		
		    Examples:
		
		      | username              | fileType |
		      | hr1@cydeo.com         | pdf      |
		      | hr1@cydeo.com         | txt      |
		      | helpdesk1@cydeo.com   | jpeg     |
		      | helpdesk1@cydeo.com   | png      |
		      | marketing1@cydeo.com  | docx     |	

	
	@B32G4-103
	Scenario Outline: Verify user should be able to insert the files and images into the text
		Given Given the "<username>" successfully uploads a "<fileType>" file
		    When the user clicks on the insert button to upload the file into message text
		    Then the user should see the file inserted in to message text
		
		
		    Examples:
		      | username              | fileType |
		      | hr1@cydeo.com         | pdf      |
		      | hr1@cydeo.com         | txt      |
		      | helpdesk1@cydeo.com   | jpeg     |
		      | helpdesk1@cydeo.com   | png      |
		      | marketing1@cydeo.com  | docx     |	

	
	@B32G4-104
	Scenario Outline: Verify user should be able to remove files and images at any time before sending.
		Given the "<username>" inserted a "<fileType>" file successfully into message text
		    When user clicks on the x button
		    Then the message content should not contain the removed "<fileType>"
		
		    Examples:
		      | username              | fileType |
		      | hr1@cydeo.com         | pdf      |
		      | hr1@cydeo.com         | txt      |
		      | helpdesk1@cydeo.com   | jpeg     |
		      | helpdesk1@cydeo.com   | png      |
		      | marketing1@cydeo.com  | docx     |