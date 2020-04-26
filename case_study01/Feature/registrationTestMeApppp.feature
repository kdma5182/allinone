Feature: Registration

Scenario: Successful Registration with Valid Credentials  
	Given User is on Home Page
	When User Navigate to Registration Page
	And User enters UserName and Password
	Then Message displayed Registration Successfully
Scenario: Successful Registration
	When User Login to the Application
	Then Message displayed Login Successfully
