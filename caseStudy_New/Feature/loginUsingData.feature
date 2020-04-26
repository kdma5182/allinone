Feature: scenario outline


@Login
Scenario Outline: I Want To Login Into TestMeApp With Valid Credentails


 Given I will be on Login page



 When I will enter "<username>" and "<password>"



 And I will click on Login pagee



 Then I should be Logged in Successfully

Examples:

|username||password|
|lalitha||password123|
|lalitha||password123|


Scenario Outline: Login functionality of registered User

Given user navigates to testmeapp

When User enter Username as "<username>" and Password as "<password>"

Examples: −
| username  | password  |
| lalitha | password123 |
 
 
Scenario Outline: Search a product and select the first product to find

 Given User search for Headphone and Lappy
  
  When User should type first four letter of desired product as "<name>"
 
 And select the first item that appears in the search result to find product detail

Examples: − 
 | name |
 | head |
       