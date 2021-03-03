@retialPage
Feature: Retail Website Features



#Every feature file starts with feature: <Name of feature file>
#Every scenario starts with scenario: <Name of Test case we want to automate>
#Gherkin keywords are Given when then 
#Given is precondition
#When is an action taken
#Then is an expected result (we write validation)
#And is repeating an action or can be used following Given Keyword as well
#But is used for negative scenario verification

Background:
     Given User is on Retail website 


@Test
Scenario: Search functionality test case
   
   When User seach for 'iphone'
   And User click on search button
   Then User should see Iphone image


#In scenario Outline we can run same scenario with mulitple set of date we will use examples keyword to pass different date
#every scenario outline follows with examples keyword
#under examples each row represent one time of execution
@Test123
Scenario Outline: Test Search Functionality with multiple set of Data
  
   When User Search for '<itemName>'
   And User click on search button
   
 
 Examples:
  |itemName|
  |ihone|
  |mac book|
  |Canon|
  
@RagistrationTest
Scenario: Register an Account test case

        When User click on MyAccount
        And User click on Register option
        And User fill the Registration form with Below information
        |firstName|lastName|email|telephone|password|confirmPassword|subscribe|
        |Ahmad|Zeya|sayedahmad.zeya@gmail.com|5717071159|4030|4030|yes|
        And User accept the privacy and policy
        And User click on Continue button
        Then User should be registered in Retail Website
           