package com.spotify.steps.serenity;

import com.spotify.pages.SignUpPage;
import net.thucydides.core.annotations.Step;

public class SignUpSerenitySteps {
    private SignUpPage signUpPage;

    @Step("User open 'Sign Up' page")
    public void open_signup_page() {
        signUpPage.open();
    }

    @Step("User set [0] email")
    public void type_email(String email) {
        signUpPage.setEmail(email);
    }

    @Step("Close pop up if it appear")
    public void close_pop_up() {
        signUpPage.closePopUp();
    }

    @Step("Click 'Sign-up' button")
    public void click_sign_up_button() {
        signUpPage.clickSignUpButton();
    }

    @Step("Is [0] error message shown")
    public boolean is_error_message_shown(String errorMessage) {
        return signUpPage.isErrorMessageShown(errorMessage);
    }
}
