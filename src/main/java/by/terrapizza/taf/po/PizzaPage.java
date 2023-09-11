package by.terrapizza.taf.po;

import by.terrapizza.taf.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaPage extends HomePage {
    private String addMargaritaToCartButton = "//button [@data-id='364'][@class='menu-card__footer-btn add-basket-btn']";
    private String add4CheesesToCartButton = "//button[@data-id='650']";
    private String cartButton = "//div[@class = 'basket__btn-top basket__top basket__btn-top--sm' ]";

    public PizzaPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickMenuButton() {
        super.clickMenuButton();
    }

    public void addPizzaToCart(int pizzaIndex) throws InterruptedException {
        WebElement addMargaritaToCartElement = driver.findElement(By.xpath(addMargaritaToCartButton));
        WebElement add4CheesesToCartElement = driver.findElement(By.xpath(add4CheesesToCartButton));
        List<WebElement> pizzaElements = new ArrayList<>();
        pizzaElements.add(0, addMargaritaToCartElement);
        pizzaElements.add(1, add4CheesesToCartElement);
        Thread.sleep(5);
        pizzaElements.get(pizzaIndex).click();
    }
}

