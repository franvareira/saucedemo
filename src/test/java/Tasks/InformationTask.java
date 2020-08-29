package Tasks;

import Framework.Report;
import Framework.Screenshot;
import Framework.Waits;
import PageObjects.CartPage;
import PageObjects.FinishPage;
import PageObjects.InformationPage;
import Utils.FakersGenerator;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


public class InformationTask {

    private static WebDriver driver;
    private static InformationPage informationPage;
    private static FinishPage finishPage;
    private static CartPage cartPage;
    private static Waits wait;
    private static FakersGenerator faker;

    public InformationTask(WebDriver driver) {

        this.driver = driver;
        informationPage = new InformationPage(this.driver);
        finishPage = new FinishPage(this.driver);
        wait = new Waits(this.driver);
        cartPage = new CartPage(this.driver);
        faker = new FakersGenerator(this.driver);
    }

    public void preencherInformacoes(){

        informationPage.getFirstNameTextField().sendKeys(faker.getFirstName());
        informationPage.getLastNameTextField().sendKeys(faker.getLastName());
        informationPage.getZipTextField().sendKeys(faker.getZipCode());
        validaInformacoes();
        informationPage.getContinueButton().click();
        validaPageOverview();
        informationPage.getFinishButton().click();
    }

    private void validaInformacoes(){
        try{
            Assertions.assertFalse(informationPage.getFirstNameTextField().getAttribute("value").equalsIgnoreCase(" "));
            Report.extentTest.log(Status.PASS, "Dados preenchidos corretamente", Screenshot.screenshotBase64(driver));

        }catch (Exception e){

            Report.extentTest.log(Status.FAIL, "Dados não foram preenchidos" , Screenshot.screenshotBase64(driver));
        }
    }

    private void validaPageOverview(){
        try{
            wait.loadElement(cartPage.getPageLabel());
            String label = cartPage.getPageLabel().getText();
            Assertions.assertEquals(label, "Checkout: Overview");
            Report.extentTest.log(Status.INFO , "Pagina Overview Carregada", Screenshot.screenshotBase64(driver));
        }catch (Exception e){
            Report.extentTest.log(Status.FAIL, "Pagina Overview não foi carregada", Screenshot.screenshotBase64(driver));
        }
    }







}
