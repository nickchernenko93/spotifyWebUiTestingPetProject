package com.spotify.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.spotify.configuration.UrlManager.HOME_PAGE_URL;

@DefaultUrl(HOME_PAGE_URL)
public class HomePage {

    private By homePageIcon = By.xpath("//span[contains(text(), 'Home')]");

    public boolean isHomePageOpened(){
        return $(homePageIcon).isDisplayed();
    }
}
