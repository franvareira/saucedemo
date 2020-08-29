package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage {

    private WebDriver driver;
    private Waits wait;

    public InformationPage(WebDriver driver) {
        wait = new Waits(driver);
        this.driver = driver;
    }

    public WebElement getFirstNameTextField() {
        return driver.findElement(By.id("first-name"));
    }
    public WebElement getLastNameTextField() {
        return driver.findElement(By.id("last-name"));
    }
    public WebElement getZipTextField() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {

        return this.driver.findElement(By.xpath("//div[@class='checkout_buttons']/input[@class='btn_primary cart_button']"));

    }

    public WebElement getFinishButton(){

        return driver.findElement(By.xpath("//div[@class='cart_footer']/a[@href='./checkout-complete.html']"));
    }

}
