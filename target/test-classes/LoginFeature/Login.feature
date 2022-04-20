 Feature: To validate the login function

 Scenario: to validate the login functionality with invalid credentials
	Given the user should be in facebook login page
	When the user has to fill the username and password detail
	
		|agilan05@gmail.com|785496321|
		|surya045@gmail.com|124578963|
		|kadhir44@gmail.com|124578977|
		|naveen77@gmail.com|124578978|
		|santhana47859@gmail.com|12457789963|
	And  the user has to click login button
	Then the user should navigate to invalid login page 
	
	
	
	