package login;

import io.qameta.allure.Step;
import pageObject.HomePage;

public class LoginSettings extends AbstractApp {
    private static final String PET_STORE_URL = "https://petstore.octoperf.com/";

    @Step
    public HomePage openHomePage() {
        AbstractApp
                .getDriverInstance()
                .get(PET_STORE_URL);
        return new HomePage();
    }

}
