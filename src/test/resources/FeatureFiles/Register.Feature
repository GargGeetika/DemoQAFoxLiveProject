Feature: Registration Functionality
	
	Scenario: Verify the user is able to register by providing all the details in the registration screen
	Given I launch the application
	And Navigate to Register page
	When I fill all the Registration Details
		|FirstName|Tom   							|
		|LastName |Cruise							|
		|Email		|TomCruise@gmail.com|
		|Telephone|905-900-9000				|
		|Password	|test1234						|
	And I click on privacy Policy
	And I click on continue button
	Then the User account should be created successfully	