package com.spotify.steps.serenity;

import com.codeborne.selenide.Selenide;
import com.spotify.pages.SignUpPage;
import net.thucydides.core.annotations.Step;

import static com.spotify.configuration.UrlManager.SIGN_UP_URL;

public class SignUpSerenitySteps {
    private SignUpPage signUpPage = new SignUpPage();

    @Step("User open 'Sign Up' page")
    public void open_signup_page() {
        Selenide.open(SIGN_UP_URL);
    }

    @Step("User set username")
    public void set_username(String username) {
        signUpPage.setEmail(username);
    }

    @Step("User set password")
    public void set_password(String password){
        signUpPage.setPassword(password);
    }

    @Step("Close pop up if it appear")
    public void close_pop_up() {
        signUpPage.closePopUp();
    }

    @Step("Click 'Sign-up' button")
    public void click_next_button() {
        signUpPage.clickNextButton();
    }

    @Step("Is '{0}' error message shown")
    public boolean is_error_message_shown(String errorMessage) {
        return signUpPage.isErrorMessageShown(errorMessage);
    }
}
