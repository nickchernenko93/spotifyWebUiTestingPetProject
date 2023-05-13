import login.LoginSettings;
import org.testng.annotations.Test;
import pageObject.HomePage;

public class SimpleTest {
private HomePage homePage;
private LoginSettings loginSettings =  new LoginSettings();
    @Test
    public void testing() {
        loginSettings.openHomePage();
    }
}
