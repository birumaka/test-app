package test;

import base.ProjectConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.LoginPage;

import java.io.FileNotFoundException;

public class BaseTest {
    protected WebDriver _driver;

    @BeforeTest
    void setUp() throws FileNotFoundException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("window.size=1920*1080");
        _driver = new ChromeDriver(options);

        /*
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         */

        String baseUrl = ProjectConfiguration.getPropValue().getProperty("baseURL");
        String userName = ProjectConfiguration.getPropValue().getProperty("username");
        String password = ProjectConfiguration.getPropValue().getProperty("password");

        LoginPage loginPage = new LoginPage(_driver);
        _driver.get(baseUrl);
        loginPage.loginCred(userName, password);
        loginPage.clickLoginButton();
    }

    @AfterTest
    void tearDown(){
        _driver.quit();
    }
}
