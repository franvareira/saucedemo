package Tasks;

import Framework.Report;
import Framework.Screenshot;
import PageObjects.InventoryDetailsPage;
import PageObjects.LoginPage;
import PageObjects.SelecionarProdutoPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class SelecionarProdutoTask {

    private static WebDriver driver;
    private static SelecionarProdutoPage selectProduto;
    private static InventoryDetailsPage invetoryPage;

    public SelecionarProdutoTask(WebDriver driver) {

        this.driver = driver;
        selectProduto = new SelecionarProdutoPage(this.driver);
        invetoryPage = new InventoryDetailsPage(this.driver);
    }

    public void selecionarProduto(){

        selectProduto.getProdutoLinkImage().click();
        validaSelecaoProduto();

    }

    private void validaSelecaoProduto(){
        try{
            Assertions.assertTrue(invetoryPage.getProductCarLabel().isDisplayed());
            Report.extentTest.log(Status.PASS, "Item selecionado com sucesso", Screenshot.screenshotBase64(driver));

        } catch (Exception e){
            Report.extentTest.log(Status.FAIL, "Não foi selecionado nenhum Produto", Screenshot.screenshotBase64(driver));
        }
    }

}
