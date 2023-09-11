import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    @BeforeEach
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.terrapizza.by/");
    }
    @AfterEach
    public void driverShutDown() {
        driver.quit();
    }

}
