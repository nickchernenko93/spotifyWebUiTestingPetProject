package com.spotify.steps.jbehave;

import com.spotify.data.users.UserDataProvider;
import com.spotify.steps.serenity.LoginSerenitySteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class LoginPageSteps {

    private UserDataProvider userDataProvider = new UserDataProvider();
    @Steps
    LoginSerenitySteps loginSerenitySteps;

    @Given("I open login page")
    public void openLoginPage() {
        loginSerenitySteps.open_login_page();
    }

    @When("I set valid user name")
    public void setUserName() {
        loginSerenitySteps.set_username(userDataProvider.getRegisterUserName());
    }

    @When("I set valid password")
    public void setPassword() {
        loginSerenitySteps.set_password(userDataProvider.getRegisterUserPassword());
    }

    @When("I click login button")
    public void clickLoginButton() {
        loginSerenitySteps.click_login_button();
    }

    @Then("I should be redirected to home page")
    public void isHomePageOpened() {
        Assert.assertTrue("Home page should be opened", loginSerenitySteps.is_home_page_opened());
    }
}
