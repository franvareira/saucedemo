package TestCases;

import Framework.Report;
import Framework.Screenshot;
import Framework.TestBase;
import PageObjects.InventoryDetailsPage;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TestBase {

    private WebDriver driver = this.getDriver();

    LoginTask login = new LoginTask(driver);
    SelecionarProdutoTask produto = new SelecionarProdutoTask(driver);
    InvetoryDetailsTask  invetoryProduto= new InvetoryDetailsTask(driver);
    CartTask cart = new CartTask(driver);
    InformationTask informacoes = new InformationTask(driver);
    FinishTask finish = new FinishTask(driver);

    /* Iniciar com passo normal sem try/cat, apos construção do report, incluir try/cat */
    @Test
    public void realizarCompra(){

        try {

            Report.startTestReport("Realizar Compra com Sucesso");

            login.realizarLogin();
            produto.selecionarProduto();
            invetoryProduto.addToCart();
            cart.realizarChekout();
            informacoes.preencherInformacoes();
            finish.finalizarCompra();


        }catch (Exception e){

            Report.extentTest.log(Status.ERROR, e.getMessage(), Screenshot.screenshotBase64(driver));

        }


    }

}
