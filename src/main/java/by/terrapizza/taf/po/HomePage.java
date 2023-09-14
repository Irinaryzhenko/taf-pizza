package by.terrapizza.taf.po;
import by.terrapizza.taf.po.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage {
    public WebDriver driver;
    public String menuButton = "//li[@class='main-menu__item']/a[@href='https://terrapizza.by/menu']";

    public HomePage() {
        this.driver = Singleton.getDriver();
    }
    public void clickMenuButton() {
        WebElement menuButtonElement = driver.findElement(By.xpath(menuButton));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        menuButtonElement.click();
    }
    public void openHomePage(){
        driver.get("https://www.terrapizza.by/");
        }

}


