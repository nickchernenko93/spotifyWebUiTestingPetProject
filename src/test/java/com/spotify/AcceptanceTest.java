package com.spotify;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class AcceptanceTest extends SerenityStories {

    /**
     * Define the webdriver instance to be used for tests
     */
    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;
}
