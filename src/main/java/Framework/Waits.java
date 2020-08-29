package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    /*  Existem duas formas de montar os waits */

   /* private WebDriverWait wait;

    public Waits(WebDriver driver){

        wait = new WebDriverWait(driver,20);
    }

    public WebElement visibilityOfElement(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }*/

    private WebDriver driver;

    public Waits(WebDriver driver){

        this.driver = driver;
    }

    public WebElement visibilityOfElement(By by){

        WebDriverWait wait = new WebDriverWait(driver, 20);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public  WebElement loadElement(WebElement element){
        try{

            return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));

        }catch (WebDriverException e){

            return element;
        }
    }


}
