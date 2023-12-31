package by.terrapizza.taf.po;

import by.terrapizza.taf.po.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class CartPage {
    WebDriver driver;
    private String pizzaInCart = "//div[@class = 'basket__products-item-name']";
    private String iceLateInCart = "//div[@class = 'basket__products-item-name'] [contains(text(), 'Айс Латте')]";

    public CartPage() {
        this.driver = Singleton.getDriver();
    }

    public boolean checkItemsInCart() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(pizzaInCart)));

        String pizzaInCartText = driver.findElement(By.xpath(pizzaInCart)).getText();

        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(iceLateInCart)));

        String drinkInCartText = driver.findElement(By.xpath(iceLateInCart)).getText();

        boolean isItemsInCart = (pizzaInCartText.contains("Маргарита") | pizzaInCartText.contains("Кватроформаджио"))
                && drinkInCartText.contains("Айс Латте");

        return isItemsInCart;
    }
}
