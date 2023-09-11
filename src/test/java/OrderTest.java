import by.terrapizza.taf.HomePage;
import by.terrapizza.taf.po.BarPage;
import by.terrapizza.taf.po.CartPage;
import by.terrapizza.taf.po.MenuPage;
import by.terrapizza.taf.po.PizzaPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class OrderTest extends BaseTest {
    @DisplayName("Testing of making order")
    @Test
    public void makingOrderPizzaAndDrink() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickMenuButton();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.closeCookiesWindow();
        menuPage.openPizzaMenu();
        PizzaPage pizzaPage = new PizzaPage(driver);
        pizzaPage.addPizzaToCart(0);
        pizzaPage.clickMenuButton();
        menuPage.openBarMenu();
        BarPage barPage = new BarPage(driver);
        barPage.addToCartIceLate();
        barPage.openCart();
        CartPage cartPage = new CartPage(driver);
        Thread.sleep(20);
        cartPage.checkItemsInCart();
    }
}
