package com.spotify.steps.jbehave;

import com.spotify.steps.serenity.SignUpSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SignUpPageSteps {

    @Steps
    SignUpSteps signUpSteps;

    @Given("I open sign up page")
    public void openSignUpPage() {
        signUpSteps.open_signup_page();
    }

    @When("I close pop up")
    public void closePopUp() {
        signUpSteps.close_pop_up();
    }

    @When("I set password \"$password\"")
    public SignUpPageSteps setPassword(String password) {
        signUpSteps.set_password(password);
        return this;
    }

    @When("I press 'Sign-up' button")
    public void clickSignUpButton() {
        signUpSteps.click_sign_up_button();
    }

    @Then("I see error message \"$errorMessage\"")
    public void isErrorMessageShown(String errorMessage) {
        signUpSteps.is_error_message_shown(errorMessage);
    }
}
