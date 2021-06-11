package base;

import java.io.*;
import java.util.Properties;

public class ProjectConfiguration {
    static String projectPath = System.getProperty("user.dir");

    public static Properties getPropValue() throws FileNotFoundException {
        Properties prop = new Properties();
        InputStream inputStream = new FileInputStream(projectPath+ "/src/main/resources/config.properties");
        try(inputStream){
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
