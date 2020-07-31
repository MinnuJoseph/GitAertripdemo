Feature: Homepage login

Scenario Outline: Login to Application
Given Initilize driver and navigate to url "http://aertrip.com"
When Click the hotel tab
And Enter CityName <city> and click enter
And Select the ToCalendar and click ok
And Enter the child and family members and click the search button
Then Move to Hotel page list 

Examples:
|city							|
|Toronto, Ontario, Canada		|
	



