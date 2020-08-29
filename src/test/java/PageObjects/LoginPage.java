package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private Waits wait;

    public LoginPage(WebDriver driver) {
        wait = new Waits(driver);
        this.driver = driver;
    }
    public WebElement getUsernameTextField() {
        return wait.visibilityOfElement(By.id("user-name"));
    }
    public WebElement getPasswordTextField() {
        return driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton() {
        return driver.findElement(By.className("btn_action"));
    }

    public WebElement getLogoImage() { return this.driver.findElement(By.className("login_logo"));

    }

}

