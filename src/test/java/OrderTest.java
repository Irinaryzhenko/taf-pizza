import by.terrapizza.taf.po.HomePage;
import by.terrapizza.taf.po.BarPage;
import by.terrapizza.taf.po.CartPage;
import by.terrapizza.taf.po.MenuPage;
import by.terrapizza.taf.po.PizzaPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class OrderTest extends BaseTest {
    @DisplayName("Testing of making order")
    @Test
    public void makingOrderPizzaAndDrink() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickMenuButton();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.closeCookiesWindow();
        menuPage.openPizzaPage();
        PizzaPage pizzaPage = new PizzaPage(driver);
        pizzaPage.addPizzaToCart(1);
        pizzaPage.clickMenuButton();
        menuPage.openBarPage();
        BarPage barPage = new BarPage(driver);
        barPage.addToCartIceLate();
        barPage.openCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.checkItemsInCart();
    }
}
