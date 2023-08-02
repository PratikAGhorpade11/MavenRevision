Feature: Login functionality 

Scenario Outline: Validate logging into application using valid credentials

Given user is on homepage 
When user clicks on Signin 
And user enters email as "<email>" and enters password as "<password>" and click on login button
Then user is logged in successfully

Examples:
|email|password|
|amar.tstacc@gmail.com|Test@1234|

Scenario Outline: Validate logging into application using invalid credentials

Given user is on homepage 
When user clicks on Signin 
And user enters email as "<email>" and enters password as "<password>" and click on login button
Then user is not logged in 

Examples:
|email|password|
|afsgdfhj|asjdfgh|