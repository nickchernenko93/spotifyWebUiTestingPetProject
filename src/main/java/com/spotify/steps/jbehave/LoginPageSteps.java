package com.spotify.steps.jbehave;

import com.spotify.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LoginPageSteps {

    @Steps
    LoginSteps loginSteps;

    @Given("I open login page")
    public void openLoginPage() {
        loginSteps.open_login_page();
    }

    @When("I set valid user name")
    public void setEmail(String userName) {
        loginSteps.set_userName(userName);
    }

    @When("I set valid password")
    public void setPassword(String password) {
        loginSteps.set_password(password);
    }

    @When("I click login button")
    public void clickLoginButton() {
        loginSteps.click_login_button();
    }

    @Then("I should be redirected to home page")
    public boolean isHomePageOpened() {
        return loginSteps.is_home_page_opened();
    }
}
