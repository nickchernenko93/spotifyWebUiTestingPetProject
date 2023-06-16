import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import steps.SignUpSteps;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSignUp {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    SignUpSteps signUpSteps;

    @Test
    public void whenEnteringInvalidEmail() {
        signUpSteps.open_signup_page();
        signUpSteps.type_email("gmail");
    }

}
