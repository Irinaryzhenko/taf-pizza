import by.terrapizza.taf.po.HomePage;
import by.terrapizza.taf.po.util.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;


public class BaseTest {
    @BeforeEach
    public void driverSetup() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
    }
    @AfterEach
    public void driverShutDown() {
        Singleton.quitDriver();
    }
}
