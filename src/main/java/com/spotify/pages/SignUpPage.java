package com.spotify.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.spotify.configuration.UrlManager.SIGN_UP_URL;

@DefaultUrl(SIGN_UP_URL)
public class SignUpPage {

    private By passwordField = By.xpath(".//input[@type='password']");
    private By emailField = By.xpath("//input[@type='email']");
    private By profileNameField = By.xpath("//input[@placeholder='Enter a profile name.']");
    private By dayOfBirthField = By.xpath("//input[@id='day']");
    private By monthDropDown = By.xpath("//select[@id='month']");
    private By yearOfBirthField = By.xpath("//input[@id='year']");
    private By genderRadioButtons = By.xpath("//fieldset//div//label[contains(text, '%s')]");
    private By nextButton = By.xpath("//button//span[contains(text(), 'Next')]");
    private By closePopOverButton = By.xpath("//div[@id='onetrust-close-btn-container']");

    public SignUpPage setEmail(String email) {
        $(emailField).shouldBe(Condition.visible)
                .setValue(email);
        return this;
    }

    public SignUpPage setPassword(String password) {
        $(passwordField).should(Condition.exist)
                .shouldBe(Condition.enabled)
                .setValue(password);
        return this;
    }

    public SignUpPage setName(String name) {
        $(profileNameField).should(Condition.exist)
                .shouldBe(Condition.enabled)
                .setValue(name);
        return this;
    }

    public SignUpPage setDayOfBirth(String dayOfBirth) {
        $(dayOfBirth).should(Condition.exist)
                .shouldBe(Condition.enabled)
                .setValue(dayOfBirth);
        return this;
    }

    public SignUpPage selectMonth(String month) {
        $(monthDropDown).should(Condition.exist)
                .shouldBe(Condition.enabled)
                .selectOptionByValue(month);
        return this;
    }

    public SignUpPage setYearOfBirth(String year) {
        $(yearOfBirthField).should(Condition.exist)
                .shouldBe(Condition.enabled)
                .setValue(year);
        return this;
    }

    public SignUpPage acceptTerms() {
        ElementsCollection elements = $$x("//div[@data-encore-id = 'formCheckbox']");
        for (SelenideElement element : elements) {
            element.click();
        }
        return this;
    }

    public SignUpPage clickNextButton() {
        $(nextButton).should(Condition.exist)
                .shouldBe(Condition.enabled)
                .click();
        return this;
    }

    public SignUpPage closePopUp() {
        $(closePopOverButton)
                .shouldBe(Condition.enabled)
                .click();
        return this;
    }

    public boolean isErrorMessageShown(String errorMessageText) {
        By errorMessage = By.xpath((String.format("//div[@aria-label='Error indicator']//span[contains(text(), '%s')]", errorMessageText)));
        return $(errorMessage).isDisplayed();
    }
}
