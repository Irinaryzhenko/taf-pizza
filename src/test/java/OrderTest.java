import by.terrapizza.taf.po.HomePage;
import by.terrapizza.taf.po.BarPage;
import by.terrapizza.taf.po.CartPage;
import by.terrapizza.taf.po.MenuPage;
import by.terrapizza.taf.po.PizzaPage;
import by.terrapizza.taf.po.util.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class OrderTest extends BaseTest {
    @DisplayName("Testing of making order")
    @Test
    public void makingOrderPizzaAndDrink() {
        HomePage homePage = new HomePage();
        homePage.clickMenuButton();

        MenuPage menuPage = new MenuPage();
        menuPage.closeCookiesWindow();
        menuPage.openPizzaPage();

        PizzaPage pizzaPage = new PizzaPage();
        pizzaPage.addPizzaToCart(1);
        pizzaPage.clickMenuButton();

        menuPage.openBarPage();
        BarPage barPage = new BarPage();
        barPage.addToCartIceLate();
        barPage.openCart();

        CartPage cartPage = new CartPage();

        new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy
                (By.xpath("//div[@class = 'basket__products-item-name']")));
               Assertions.assertTrue(cartPage.checkItemsInCart());
    }
}
