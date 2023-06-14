package login;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import pageObject.HomePage;

public class PetStore {
    private static final String PET_STORE_URL = "https://petstore.octoperf.com/actions/Catalog.action";

    @Step
    public HomePage openHomePage() {
        Selenide.open(PET_STORE_URL);
        return new HomePage();
    }
}


