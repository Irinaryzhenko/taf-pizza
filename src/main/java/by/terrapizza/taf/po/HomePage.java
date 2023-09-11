package by.terrapizza.taf.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;
    public String menuButton = "//li[@class='main-menu__item']/a[@href='https://terrapizza.by/menu']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMenuButton() {
        WebElement menuButtonElement = driver.findElement(By.xpath(menuButton));
        menuButtonElement.click();
    }
}


