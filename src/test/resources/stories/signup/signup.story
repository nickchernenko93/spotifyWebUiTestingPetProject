Narrative:
To covered basic sign up test

Scenario: Type invalid username
Given I open sign up page
When I close pop up
And I set invalid username
And I press 'Sign-up' button
Then I see error message "This email is invalid"
