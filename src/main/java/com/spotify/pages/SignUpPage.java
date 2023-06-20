package com.spotify.pages;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.spotify.configuration.DriverManager.SIGN_UP_URL;

@DefaultUrl(SIGN_UP_URL)
public class SignUpPage extends PageObject {

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@placeholder='Enter a profile name.']")
    private WebElement profileNameField;
    @FindBy(xpath = "//input[@id='day']")
    private WebElement dayOfBirthField;
    @FindBy(xpath = "//select[@id='month']")
    private WebElement monthDropDown;
    @FindBy(xpath = "//input[@id='year']")
    private WebElement yearOfBirthField;
    @FindBy(xpath = "//fieldset//div//label[contains(text, '%s')]")
    private WebElement genderRadioButtons;
    @FindBy(xpath = "//div[@data-encore-id = 'formCheckbox']")
    private ListOfWebElementFacades termsCheckBoxes;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signUpButton;
    @FindBy(xpath = "//div[@id='onetrust-close-btn-container']")
    private WebElement closePopOverButton;

    public SignUpPage setEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public SignUpPage setPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public SignUpPage setName(String name) {
        profileNameField.sendKeys(name);
        return this;
    }

    public SignUpPage setDayOfBirth(String dayOfBirth) {
        dayOfBirthField.sendKeys(dayOfBirth);
        return this;
    }

    public SignUpPage selectMonth(String month) {
        monthDropDown.sendKeys(month);
        return this;
    }

    public SignUpPage setYearOfBirth(String year) {
        yearOfBirthField.sendKeys(year);
        return this;
    }

    public SignUpPage acceptTerms() {
        termsCheckBoxes.forEach(el -> el.click());
        return this;
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public SignUpPage closePopUp() {
        if (closePopOverButton.isDisplayed()) {
            closePopOverButton.click();
        }
        return this;
    }

    public boolean isErrorMessageShown(String errorMessageText) {
        WebElement errorMessage = find(By.xpath(String.format("//div[@aria-label='Error indicator']//span[contains(text(), '%s')]", errorMessageText)));
        return errorMessage.isDisplayed();
    }
}
