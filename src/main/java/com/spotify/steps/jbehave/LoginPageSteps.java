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

    @When("I set invalid user name")
    public void setUserName() {
        loginSerenitySteps.set_username(userDataProvider.getValidUserName());
    }

    @When("I set invalid password")
    public void setPassword() {
        loginSerenitySteps.set_password(userDataProvider.getValidUserPassword());
    }

    @When("I click login button")
    public void clickLoginButton() {
        loginSerenitySteps.click_login_button();
    }

    @Then("I should not be redirected to home page")
    public void isHomePageOpened() {
        Assert.assertFalse("Home page should not be opened", loginSerenitySteps.is_home_page_opened());
    }

    @Then("I should see error message")
    public void isErrorMessageShown() {
        Assert.assertTrue("Error message should be shown", loginSerenitySteps.is_error_message_shown());
    }
}
