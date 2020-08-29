package Framework;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    private static final String PATH_SCREENSHOT = System.getProperty("user.dir") + File.separator + "Report" + File.separator + "Screenshot";

    /* O tipo MediaEntityModelProvider vem da biblioteca do ExtentReport */

    public static MediaEntityModelProvider screenshotFull(WebDriver driver) throws IOException {


        CreateFolder.createFolderReport(PATH_SCREENSHOT);

        /* Converter o objeto do Webdriver para TakeScreenshot e vai Mover o arquivo gerado de imagem para o destino final */

        File scrshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String path = PATH_SCREENSHOT + File.separator + scrshot.getName();

        FileUtils.copyFile(scrshot, new File(path));

        return MediaEntityBuilder.createScreenCaptureFromPath(path).build();

    }

    public static MediaEntityModelProvider screenshotBase64(WebDriver driver) {

        try {

            CreateFolder.createFolderReport(PATH_SCREENSHOT);
            return MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64)).build();
        } catch (Exception ex) {

            System.out.println(ex.getMessage() + "Não gerou screenshot");
        }

        return null;
    }

}
