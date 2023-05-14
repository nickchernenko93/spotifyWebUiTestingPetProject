package login;

import org.openqa.selenium.WebDriver;

public abstract class AbstractWeb {
    private static final ThreadLocal<Browser> WEB = ThreadLocal.withInitial(Browser::new);

    public static ThreadLocal<Browser> getBrowser() {
        return WEB;
    }

    public static WebDriver getDriverInstance() {
        return getBrowser()
                .get()
                .getDriver();
    }

    public static void tearDownBrowser() {
        getBrowser().get().quitDriver();
        getBrowser().remove();
    }

}

