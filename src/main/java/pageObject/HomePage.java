package pageObject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasicPageObject {
    public SelenideElement searchField = $x("//div//input[@name='keyword']");
    public SelenideElement searchButton = $x("//input[@value='Search']");

    @Step
    public void setSearchValue(String searchValue) {
        searchField.setValue(searchValue);
    }

    @Step
    public void clickSearchButton() {
        searchButton.click();
    }
}
