   Feature: As a candidate I want a login page so that only authentic 
     candidate will be able to login
         
     Scenario Outline: Valid candidate should be able to login 
     Given I am on daily.jobs site
     When I enter "<email>" and "<password>"
     And I click on Login button 
     Then Dashboard page should display 
     
     Examples:
     |email| password|
     |roustame4@gmail.com|Qwerty7|