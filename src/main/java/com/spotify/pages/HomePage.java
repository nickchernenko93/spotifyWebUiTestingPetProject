package com.spotify.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private By homePageIcon = By.xpath("//span[contains(text(), 'Home')]");

    public boolean isHomePageOpened() {
        return $(homePageIcon).isDisplayed();
    }
}
