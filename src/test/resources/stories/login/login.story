Meta:

Narrative:
As a register user i want to perform login action for spotify

Lifecycle:
Before:
Given I open login page

Scenario: Enter invalid username and password
When I set invalid user name
And I set invalid password
And I click login button
Then I should not be redirected to home page

Scenario: Enter only invalid username
When I set invalid user name
And I click login button
Then I should see error message