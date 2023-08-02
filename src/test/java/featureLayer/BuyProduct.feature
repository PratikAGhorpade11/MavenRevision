Feature: Buy Product functionality 

Scenario: As registered user,buy product 

Given user is on homepage 
When user clicks on Signin 
And user enters email as "amar.tstacc@gmail.com" and enters password as "Test@1234" and click on login button
Then user is logged in successfully

When user select bags option link from Gear category 
And select any of the product from listing page 
And add to cart and click on shopping cart link and click on proceed to checkout 
And fill all necessary details for address and select shipping method and place order
Then user placed order and showing as "Thank you for your purchase!"