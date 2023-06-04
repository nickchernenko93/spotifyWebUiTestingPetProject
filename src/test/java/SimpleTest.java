import login.AbstractWeb;
import login.PetStoreWeb;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pageObject.HomePage;

public class SimpleTest {
    private HomePage homePage;
    private PetStoreWeb petStoreWeb = new PetStoreWeb();

    @Test
    public void testing() {
        petStoreWeb.openHomePage();
    }


    @AfterSuite
    public void tearDownBrowser() {
        AbstractWeb.tearDownBrowser();
    }
}
