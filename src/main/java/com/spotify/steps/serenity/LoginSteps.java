package com.spotify.steps.serenity;

import com.codeborne.selenide.Selenide;
import com.spotify.pages.HomePage;
import com.spotify.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static com.spotify.configuration.UrlManager.LOGIN_PAGE_URL;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage();

    // TODO: 7/30/23 remove it later
    private HomePage homePage = new HomePage();

    @Step("User open 'Sign Up' page")
    public void open_login_page() {
        Selenide.open(LOGIN_PAGE_URL);
    }

    @Step("User set password")
    public void set_password(String password) {
        loginPage.setPassword(password);
    }

    @Step("User set user name")
    public void set_username(String userName) {
        loginPage.setUserName(userName);
    }

    @Step("User click login button")
    public void click_login_button() {
        loginPage.clickLoginButton();
    }

    @Step("Is home page opened")
    public boolean is_home_page_opened() {
        return homePage.isHomePageOpened();
    }
}
