package login;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static login.DriverManager.SPOTIFY_URL;

public class SignUpPage {

    public SignUpPage openSignUpPage() {
        Selenide.open(SPOTIFY_URL);
        return this;
    }

    private SelenideElement emailField = $x("//input[@type='email']");
    private SelenideElement passwordField = $x("//input[@type='password']");
    private SelenideElement profileNameField = $x("//input[@placeholder='Enter a profile name.']");
    private SelenideElement dayOfBirthField = $x("//input[@id='day']");
    private SelenideElement monthDropDown = $x("//select[@id='month']");
    private SelenideElement yearOfBirthField = $x("//input[@id='year']");
    private ElementsCollection genderRadioButtons = $$x("//fieldset//div//label");
    private ElementsCollection termsCheckBoxes = $$x("//div[@data-encore-id = 'formCheckbox']");
    private SelenideElement signUpButton = $x("//button[@type='submit'");
    private SelenideElement closePopOverButton = $x("//div[@id='onetrust-close-btn-container']");
    private ElementsCollection errorMessages = $$x("//div[@aria-label='Error indicator']");

    public SignUpPage setEmail(String email) {
        emailField.setValue(email);
        return this;
    }

    public SignUpPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    public SignUpPage setName(String name) {
        profileNameField.setValue(name);
        return this;
    }

    public SignUpPage setDayOfBirth(String dayOfBirth) {
        dayOfBirthField.setValue(dayOfBirth);
        return this;
    }

    public SignUpPage selectMonth(int month) {
        monthDropDown.selectOption(month);
        return this;
    }

    public SignUpPage setYearOfBirth(String year) {
        yearOfBirthField.setValue(year);
        return this;
    }

    public SignUpPage selectGender(String gender) {
        genderRadioButtons.findBy(Condition.exactText(gender)).click();
        return this;
    }

    public SignUpPage acceptTerms() {
        termsCheckBoxes.forEach(checkbox -> {
            checkbox.shouldBe(Condition.visible);
            checkbox.shouldBe(Condition.enabled);
            checkbox.shouldNotBe(Condition.selected);
        });
        termsCheckBoxes.forEach(SelenideElement::click);
        return this;
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public SignUpPage closePopOver() {
        if (closePopOverButton.isDisplayed()) {
            closePopOverButton.click();
        }
        return new SignUpPage();
    }

    public ElementsCollection getErrorMessages(){
        return errorMessages;
    }
    public boolean isErrorMessageShown(String errorMessageText) {
        ElementsCollection filteredMessage = errorMessages.filterBy(text(errorMessageText));
        return filteredMessage.size() > 0 && filteredMessage.get(0).is(visible);
    }
}
