@B32G4-94
Feature: Default

	
	@B32G4-92
	Scenario: Verify that the user can clicking the “Log out” button
		Given the user logged in as "<userType>"
		Given the user logged in with username as "hr16@cydeo.com" and password as "UserUser"
		When The user clicks the userName button
		And The user clicks the logout button	

	
	@B32G4-93
	Scenario:  Verify that the user can see 5 options under the profile name.
		Given the user logged in as "<userType>"
		    Given the user logged in with username as "hr16@cydeo.com" and password as "UserUser"
		    When The user clicks the userName button
		    Then The User sees below list
		    
		      | My Profile              |
		      | Edit Profile Settings   |
		      | Themes                  |
		      | Configure notifications |
		      | Log out                 |