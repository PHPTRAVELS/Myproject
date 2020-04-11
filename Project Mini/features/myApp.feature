Feature: Testing phptravels application
Scenario: Registrating new user
Given open application and click on Registration link
When the user enter the details and click register
Then the system stores the details and automatically logs in

Scenario: login to the application
Given open application and clicks on the login link
When the user enter the valid username and valid password and click submit
Then the system navigates to Homepage