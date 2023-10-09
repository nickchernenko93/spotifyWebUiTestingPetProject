package com.spotify.steps.jbehave;

import com.spotify.steps.serenity.SignUpSerenitySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SignUpPageSteps {
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

    @When("I set password \"$password\"")
    public SignUpPageSteps setPassword(String password) {
        signUpSerenitySteps.set_password(password);
        return this;
    }

    @When("I press 'Sign-up' button")
    public void clickSignUpButton() {
        signUpSerenitySteps.click_sign_up_button();
    }

    @Then("I see error message \"$errorMessage\"")
    public boolean isErrorMessageShown(String errorMessage) {
        return signUpSerenitySteps.is_error_message_shown(errorMessage);
    }
}
