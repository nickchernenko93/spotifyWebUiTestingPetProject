package login;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

abstract public class ConfigurationManager {
    private SelenideDriver driver;

    @Before
    public SelenideDriver initDriver() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    private SelenideDriver createDriver() {
        SelenideConfig selenideConfiguration = configureSelenideDriverForChrome();
        return new SelenideDriver(selenideConfiguration);
    }

    private SelenideConfig configureSelenideDriverForChrome() {
        SelenideConfig selenideConfiguration = new SelenideConfig();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        selenideConfiguration.browserCapabilities(options);
        return selenideConfiguration;
    }
}
