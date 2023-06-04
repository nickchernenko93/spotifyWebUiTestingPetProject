package login;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    public SelenideDriver driver;

    @Step
    public SelenideConfig configureSelenideDriverForChrome() {
        SelenideConfig selenideConfiguration = new SelenideConfig();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        selenideConfiguration.browserCapabilities(options);
        return selenideConfiguration;
    }

    @Step
    public SelenideDriver getDriver() {
        driver = new SelenideDriver(configureSelenideDriverForChrome());
        return driver;
    }

    @Step
    public void quitDriver() {
        try {
            if (driver != null)
                driver.close();
        } finally {
            driver = null;
        }
    }
}
