package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {

    private WebDriver driver;
    private Waits wait;


    public FinishPage(WebDriver driver) {
        wait = new Waits(driver);
        this.driver = driver;
    }

    public WebElement getFinishtextLabel() {

        return wait.visibilityOfElement(By.xpath("//div[@class='complete-text']"));
    }

    public WebElement getLogoutButton() {

        return this.driver.findElement(By.xpath("//nav[@class='bm-item-list']/a[@id='logout_sidebar_link']"));

    }

    public WebElement getMenuLogoutButton() {

        return this.driver.findElement(By.className("bm-burger-button"));

    }

}
