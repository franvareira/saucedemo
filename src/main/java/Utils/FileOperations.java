package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileOperations {

    public String readProperties(String file, String property) {

        try (InputStream input = new FileInputStream(file)) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(property);
        } catch (IOException e) {
            System.out.println("Arquivo de propriedades não foi encontrado...");
            e.printStackTrace();
        }
        return null;
    }
}
