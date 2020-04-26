Feature: Login Action

Scenario: Successful Login with Valid Credentials  
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully

Scenario: Successful Logout
	When User Logout from the Application
	Then Message displayed Logout Successfully