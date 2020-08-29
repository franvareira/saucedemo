package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryDetailsPage {

    private WebDriver driver;
    private Waits wait;

    public InventoryDetailsPage(WebDriver driver) {
        wait = new Waits(driver);
        this.driver = driver;
    }

    public WebElement getCartButton() {
        return wait.visibilityOfElement(By.xpath("//div[@id='shopping_cart_container']"
                + "/a[@class='shopping_cart_link fa-layers fa-fw']"));
    }

    public WebElement getAddCartButton() {

        return this.driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']/button[@class='btn_primary btn_inventory']"));
    }

    public WebElement getProductCarLabel() {

        return this.driver.findElement(By.className("inventory_details_name"));
    }

}
