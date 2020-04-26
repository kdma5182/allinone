Feature: scenario outline

 

Scenario Outline:− Login functionality for testmeapp.

 

Given user navigates to testmeapp

 

When I enter Username as "<username>" and Password as "<password>"

 

Then login should be successful

 

Examples: −

| username  | password  |
| AlexUser | Alex123 |
