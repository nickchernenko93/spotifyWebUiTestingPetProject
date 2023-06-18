Narrative:
To covered basic sign up test

Scenario: Type invalid email
Given I open sign up page
When I close pop up
And I set invalid email
And I press 'Sign-up' button
Then I should see validation error message
