package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    private WebDriver driver;
    private Waits wait;

    public CartPage(WebDriver driver) {
        wait = new Waits(driver);
        this.driver = driver;
    }

    public WebElement getProductLabel(){

        return wait.visibilityOfElement(By.className("inventory_item_name"));
    }

    public WebElement getCheckoutButton() {

        return this.driver.findElement(By.xpath("//div[@class='cart_footer']/a[@class='btn_action checkout_button']"));

    }

    public WebElement getPageLabel() {

        return wait.visibilityOfElement(By.className("subheader"));

    }


}
