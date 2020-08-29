package TestCases;

import Framework.Report;
import Framework.Screenshot;
import Framework.TestBase;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

public class RealizarCompraParametrizadaCsv extends TestBase {

    private WebDriver driver = this.getDriver();

    LoginTask login = new LoginTask(driver);
    SelecionarProdutoTask produto = new SelecionarProdutoTask(driver);
    InvetoryDetailsTask invetoryProduto= new InvetoryDetailsTask(driver);
    CartTask cart = new CartTask(driver);
    InformationTask informacoes = new InformationTask(driver);
    FinishTask finish = new FinishTask(driver);


    @ParameterizedTest
    @CsvFileSource(resources = "/login.csv", numLinesToSkip = 1)
    public void realizarCompra(String usuario, String senha){

        try {

            Report.startTestReport("Realizar Compra com Sucesso Parametrizado com CSV");

            login.realizarLoginParametrizado(usuario,senha);
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
