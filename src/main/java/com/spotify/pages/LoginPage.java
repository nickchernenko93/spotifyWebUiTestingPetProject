package com.spotify.pages;

import com.codeborne.selenide.Condition;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.spotify.configuration.UrlManager.LOGIN_PAGE_URL;

@DefaultUrl(LOGIN_PAGE_URL)
public class LoginPage {

    private By passwordField = By.xpath(".//input[@type='password']");
    private By userNameField = By.xpath("//input[@id='login-username']");
    private By loginButton = By.xpath("//button[@id='login-button']");
    private By rememberMeCheckBox = By.xpath("//input[@id='login-remember'");

    public LoginPage setUserName(String userName) {
        $(userNameField).shouldBe(Condition.visible)
                .setValue(userName);
        return this;
    }

    public LoginPage setPassword(String password) {
        $(passwordField).shouldBe(Condition.visible)
                .setValue(password);
        return this;
    }

    public HomePage clickLoginButton() {
        $(loginButton).shouldBe(Condition.visible, Condition.enabled).click();
        return new HomePage();
    }
}
