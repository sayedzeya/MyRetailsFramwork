Feature: Ratail Macbook pro feature

@MacBookTest
Scenario: Validate Macbook por image is displayed
   
   Given User User is on the webpage
   Then User Search "Macbook pro"
   And  User click the search button
   Then User should see the Macbook pro image