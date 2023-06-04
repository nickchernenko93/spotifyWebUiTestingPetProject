package login;

import io.qameta.allure.Step;
import pageObject.HomePage;

public class PetStoreWeb extends AbstractWeb {
    private static final String PET_STORE_URL = "https://petstore.octoperf.com/";

    @Step
    public HomePage openHomePage() {
        AbstractWeb.getDriverInstance()
                .open(PET_STORE_URL);
        return new HomePage();
    }

}
