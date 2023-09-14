package by.terrapizza.taf.po;

import by.terrapizza.taf.po.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class MenuPage {
    WebDriver driver;
    private String pizzaButton = "//span [@class = 'menu-cats-list-item__title'][text()='Пицца']";
    private String barButton = "//span [@class = 'menu-cats-list-item__title'][text()='Бар']";
    private String cookiesIconToClose = "//button[@class = 'close-icon']";
    public MenuPage() {
        this.driver = Singleton.getDriver();
    }
    public void openPizzaPage() {
        WebElement pizzaElement = driver.findElement(By.xpath(pizzaButton));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pizzaElement.click();
    }
    public void  openBarPage() {
        WebElement barElement = driver.findElement(By.xpath(barButton));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        barElement.click();
    }
    public void closeCookiesWindow() {
        WebElement cookiesIconToCloseElement = driver.findElement(By.xpath(cookiesIconToClose));
        cookiesIconToCloseElement.click();
    }

}
