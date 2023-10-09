package com.spotify.steps.jbehave;

import com.spotify.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class LoginPageSteps {

    @Steps
    LoginSteps loginSteps;

    @Given("I open login page")
    public void openLoginPage() {
        loginSteps.open_login_page();
    }

    @When("I set valid user name \"$username\"")
    public void setUserName(String username) {
        loginSteps.set_username(username);
    }

    @When("I set valid password \"$password\"")
    public void setPassword(String password) {
        loginSteps.set_password(password);
    }

    @When("I click login button")
    public void clickLoginButton() {
        loginSteps.click_login_button();
    }

    @Then("I should be redirected to home page")
    public void isHomePageOpened() {
        Assert.assertTrue("Home page should be opened", loginSteps.is_home_page_opened());
    }
}
