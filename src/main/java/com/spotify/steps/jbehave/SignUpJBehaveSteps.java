package com.spotify.steps.jbehave;

import com.spotify.steps.serenity.SignUpSerenitySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SignUpJBehaveSteps {

    @Steps
    SignUpSerenitySteps signUpSerenitySteps;

    @Given("I open sign up page")
    public void openSignUpPage() {
        signUpSerenitySteps.open_signup_page();
    }

    @When("I close pop up")
    public void closePopUp() {
        signUpSerenitySteps.close_pop_up();
    }

    @When("I set invalid email")
    public void enterEmail(String email) {
        signUpSerenitySteps.type_email(email);
    }

    @When("I press 'Sign-up' button")
    public void clickSignUpButton() {
        signUpSerenitySteps.click_sign_up_button();
    }

    @Then("I should see validation error message")
    public void isErrorMessageDisplayed(String errorMessage) {
        signUpSerenitySteps.is_error_message_shown(errorMessage);
    }
}
