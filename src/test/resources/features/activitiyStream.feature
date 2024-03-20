@B32G4-97
Feature: Default

	Background: user already on the homepage
		Given the user logged in as "UserType"
		#UserType : hr , help desk , marketing

	@B32G4-95
	Scenario: Verify user sees all five options on the Activity Stream Page
		When user sees below five options on Activity stream page
			| MESSAGE |
			| TASK    |
			| EVENT   |
			| POLL    |
			| MORE    |


	@B32G4-96
	Scenario: Verify user sees all four options under the "MORE" tab
		And user clicks more option button
		Then user sees below four MoreOptions under the MORE tab
			| File         |
			| Appreciation |
			| Announcement |
			| Workflow     |