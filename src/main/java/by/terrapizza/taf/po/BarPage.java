package by.terrapizza.taf.po;

import by.terrapizza.taf.po.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class BarPage {
    WebDriver driver;
    private String addIcelateToCartButton = "//button[@data-id='1932']";
    private String cartButton = "//div[@class = 'basket__btn-top basket__top basket__btn-top--sm' ]";

    public BarPage() {
        this.driver = Singleton.getDriver();
    }
    public void addToCartIceLate(){
        WebElement addIceLatteToCartElement = driver.findElement(By.xpath(addIcelateToCartButton));
        addIceLatteToCartElement.click();
    }
    public void openCart(){
        WebElement cartElement = driver.findElement(By.xpath(cartButton));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        cartElement.click();
    }

}
