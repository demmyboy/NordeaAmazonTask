@tag
Feature: Search Item Test
Description: This feature is used to search for Nikkon Camera that contains a string (D3X) in the header details 
after sorting from highest price to lowest

@tag1
Scenario: Successful Search 
 	Given User has to be on amazon home page
	When User enters the search for nikkon
	And Clicks on the search button
	When User is on the search result page
  Then User can select highest to lowest on the sort dropdown menu
	And User should click on the header details of the second item in the result displayed
	Then User can confirm if the details header contains a string
	Then Browser should close
	 


