@B32G4-97
Feature: Default

	
	@B32G4-95
	Scenario: Verify user sees all five options on the Activity Stream Page
		Given user is on the homepage
		    When user sees below five options on Activity stream page
		      | MESSAGE |
		      | TASK    |
		      | EVENT   |
		      | POLL    |
		      | MORE    |	

	
	@B32G4-96
	Scenario: Verify user sees all four options under the "MORE" tab
		Given user is on the homepage
		    And user clicks more option button
		    Then user sees below four MoreOptions under the MORE tab
		      | File         |
		      | Appreciation |
		      | Announcement |
		      | Workflow     |