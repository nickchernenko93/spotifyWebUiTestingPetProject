package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static login.DriverManager.SPOTIFY_URL;
import static org.openqa.selenium.By.xpath;

@DefaultUrl(SPOTIFY_URL)
public class SignUpPage extends PageObject {

    private By emailField = xpath("//input[@type='email']");
    private By passwordField = xpath("//input[@type='password']");
    private By profileNameField = xpath("//input[@placeholder='Enter a profile name.']");
    private By dayOfBirthField = xpath("//input[@id='day']");
    private By monthDropDown = xpath("//select[@id='month']");
    private By yearOfBirthField = xpath("//input[@id='year']");
    private By genderRadioButtons = xpath("//fieldset//div//label[contains(text, '%s')]");
    private By termsCheckBoxes = xpath("//div[@data-encore-id = 'formCheckbox']");
    private By signUpButton = xpath("//button[@type='submit'");
    private By closePopOverButton = xpath("//div[@id='onetrust-close-btn-container']");
    private By errorMessages = xpath("//div[@aria-label='Error indicator']");

    public SignUpPage setEmail(String email) {
        find(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage setPassword(String password) {
        find(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage setName(String name) {
        find(profileNameField).sendKeys(name);
        return this;
    }

    public SignUpPage setDayOfBirth(String dayOfBirth) {
        find(dayOfBirthField).sendKeys(dayOfBirth);
        return this;
    }

    public SignUpPage selectMonth(String month) {
        find(monthDropDown).sendKeys(month);
        return this;
    }

    public SignUpPage setYearOfBirth(String year) {
        find(yearOfBirthField).sendKeys(year);
        return this;
    }

    public SignUpPage acceptTerms() {
        findAll(termsCheckBoxes).forEach(el -> el.click());
        return this;
    }

    public void clickSignUpButton() {
        find(signUpButton).click();
    }

    public SignUpPage closePopover() {
        WebElement popoverButton = find(closePopOverButton);
        if (popoverButton.isDisplayed()) {
            popoverButton.click();
        }
        return new SignUpPage();
    }

    public boolean isErrorMessageShown(String errorMessageText) {
        return findAll(errorMessages).contains(errorMessageText);
    }
}
