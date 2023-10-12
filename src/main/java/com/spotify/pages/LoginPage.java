package com.spotify.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

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

    public boolean isErrorMessageShown() {
        return $x("//span[contains(text(),'Incorrect username or password.')]").shouldBe(Condition.visible)
                .has(Condition.exactText("Incorrect username or password."));
    }
}
