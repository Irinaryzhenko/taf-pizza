package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class MenuPage {
    WebDriver driver;
    private String pizzaButton = "//span [@class = 'menu-cats-list-item__title'][text()='Пицца']";
    private String barButton = "//span [@class = 'menu-cats-list-item__title'][text()='Бар']";
    private String cookiesIconToClose = "//button[@class = 'close-icon']";
    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openPizzaMenu() throws InterruptedException {
        WebElement pizzaElement = driver.findElement(By.xpath(pizzaButton));
        Thread.sleep(15);
        pizzaElement.click();
    }
    public void  openBarMenu() throws InterruptedException {
        WebElement barElement = driver.findElement(By.xpath(barButton));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        barElement.click();
    }
    public void closeCookiesWindow() {
        WebElement cookiesIconToCloseElement = driver.findElement(By.xpath(cookiesIconToClose));
        cookiesIconToCloseElement.click();
    }

}
