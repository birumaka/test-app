package base;

import java.io.*;
import java.util.Properties;

public class ProjectConfiguration {
    static String projectPath = System.getProperty("user.dir");

    public static Properties getPropValue(){
        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream(projectPath+ "/src/main/resources/config.properties");
            prop.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
