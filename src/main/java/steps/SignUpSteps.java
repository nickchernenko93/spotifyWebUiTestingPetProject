package steps;

import net.thucydides.core.annotations.Step;
import pages.SignUpPage;

public class SignUpSteps {
    private SignUpPage signUpPage;

    @Step("User open 'Sign Up' page")
    public void open_signup_page() {
        signUpPage.open();
    }

    @Step("User set [0] email")
    public void type_email(String email) {
        signUpPage.setEmail(email);
    }

    @Step
    public void should_see_error(String errorMessage) {
    }
}
