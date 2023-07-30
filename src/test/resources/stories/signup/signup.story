Narrative:
To covered basic sign up test

Scenario: Type invalid password
Given I open sign up page
When I close pop up
And I set password "1234"
And I press 'Sign-up' button
Then I see error message "Your password is too short."
