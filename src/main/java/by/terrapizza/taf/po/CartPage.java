package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CartPage {
    WebDriver driver;
    private String pizzaInCart = "//div[@class = 'basket__products-item-name']";
    private String iceLateInCart = "//div[@class = 'basket__products-item-name'] [contains(text(), 'Айс Латте')]";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkItemsInCart() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String pizzaInCartText = driver.findElement(By.xpath(pizzaInCart)).getText();
        String drinkInCartText = driver.findElement(By.xpath(iceLateInCart)).getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        boolean isPizzaInCart = pizzaInCartText.contains("Маргарита") | pizzaInCartText.contains("Кватроформаджио");
        boolean isIceLateInCart = drinkInCartText.contains("Айс Латте");
        Thread.sleep(30);
        if (isPizzaInCart && isIceLateInCart) {
            System.out.println("Условия соответствуют");
        } else {
            System.out.println("Условия не соответствуют");
        }
    }
}
