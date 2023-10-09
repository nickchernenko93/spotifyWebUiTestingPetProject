Meta:

Narrative:
As a register user i want to perform successful login to spotify

Lifecycle:
Before:
Given I open login page

Scenario: enter valid username and password
When I set valid user name "your user name"
And I set valid password "your password"
And I click login button
Then I should be redirected to home page

