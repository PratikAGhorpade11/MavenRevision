Feature: New Account Creation/ Register functionality 

Scenario Outline: Validate register into application using valid details

Given user is on homepage 
When user clicks on create an account 
And user enters firstname as "<firstname>" and enters lastname as "<lastname>" and enters email as "<email>" and enters password as "<Password>" and enter confirm password "<confirmPassword>" and click on create an account
Then user get created successfully


Examples:
|firstname|lastname|email|password|confirmPassword|
|david|test1|david@test1.com|Test@1234|Test@1234|