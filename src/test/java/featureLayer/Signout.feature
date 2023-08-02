Feature: Signout functionality 

Scenario: Validate Signout from application 

Given user is on homepage 
When user clicks on Signin 
And user enters email as "amar.tstacc@gmail.com" and enters password as "Test@1234" and click on login button
Then user is logged in successfully
When user clicks on dropdown button 
And user clicks on Signout link 
Then User successfully Signout from application
