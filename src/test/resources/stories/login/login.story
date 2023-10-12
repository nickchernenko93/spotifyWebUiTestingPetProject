Meta:

Narrative:
As a register user i want to perform login to spotify

Lifecycle:
Before:
Given I open login page

Scenario: Enter invalid username and password
When I set invalid user name
And I set invalid password
And I click login button
Then I should be redirected to home page