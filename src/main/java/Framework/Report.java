package Framework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Report {

    public static WebDriver driver;
    private static final String PATH_REPORT = System.getProperty("user.dir") + File.separator + "Report";
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public static void configReportExtent(){

        CreateFolder.createFolderReport(PATH_REPORT);

        htmlReporter = new ExtentHtmlReporter(PATH_REPORT + File.separator + "MyReport.html");
        htmlReporter.config().setDocumentTitle("Relatorio de Execucao da Automacao");
        htmlReporter.config().setReportName("Relatorio de Execução dos Testes");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setEncoding("UTF-8");
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        htmlReporter.config().setCSS(".nav-wrapper { background-color: #1E317A !important; } .brand-logo { background-color: #1E317A !important; padding: 0 10px 0 0 !important; margin: 0 !important; position: absolute !important } .report-name { margin-left: 80px !important } .blue.darken-3 { background-color: #1E317A !important; color: #FFF !important;}");
        

        extentReports = new ExtentReports();

        extentReports.attachReporter(htmlReporter);
    }

    public static void closeReport(){

        extentReports.flush();

        if(driver!=null){

            driver.quit();
            driver=null;
        }

    }

    public static void startTestReport(String description){

        extentTest = extentReports.createTest(description);
    }


}
