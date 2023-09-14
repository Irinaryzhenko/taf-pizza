package by.terrapizza.taf.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PizzaPage extends HomePage {
    private String addMargaritaToCartButton = "//button [@data-id='364'][@class='menu-card__footer-btn add-basket-btn']";
    private String add4CheesesToCartButton = "//button[@data-id='650']";
    private String cartButton = "//div[@class = 'basket__btn-top basket__top basket__btn-top--sm' ]";

    public PizzaPage() {
        super();
    }

    @Override
    public void clickMenuButton() {
        super.clickMenuButton();
    }

    public void addPizzaToCart(int pizzaIndex) {
        WebElement addMargaritaToCartElement = driver.findElement(By.xpath(addMargaritaToCartButton));
        WebElement add4CheesesToCartElement = driver.findElement(By.xpath(add4CheesesToCartButton));
        List<WebElement> pizzaElements = new ArrayList<>();
        pizzaElements.add(0, addMargaritaToCartElement);
        pizzaElements.add(1, add4CheesesToCartElement);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pizzaElements.get(pizzaIndex).click();
    }
}

