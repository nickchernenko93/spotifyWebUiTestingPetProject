import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pageObject.HomePage;

public class SimpleTest extends AbstractTest {
    private HomePage homePage;

    @Test
    public void testing() {
        homePage = PET_STORE.openHomePage();
    }


    @AfterSuite
    public void tearDownBrowser() {
    }
}
