package Framework;

import Utils.FileOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static Framework.Report.closeReport;
import static Framework.Report.configReportExtent;

public class TestBase extends DriverManager{

    private static WebDriver driver;
    private static FileOperations fileOperations = new FileOperations();
    private String PATH = System.getProperty("user.dir") + File.separator+"src"+ File.separator + "main" + File.separator + "resources" + File.separator + "url.properties";
    private String Properties = "url.index";

    public static WebDriver getDriver(){

        driver = getDriver(TypeDriver.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp(){

        configReportExtent();
        getDriver().get(fileOperations.readProperties(PATH,Properties));
    }

    @AfterEach
    public void tearDown(){

        closeReport();
        quitDriver();

    }
}
