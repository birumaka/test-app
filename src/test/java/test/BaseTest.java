package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver _driver;

    @BeforeTest
    void setUp(){
        WebDriverManager.chromedriver().setup();
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        _driver.get("https://opensource-demo.orangehrmlive.com/");

        LoginPage loginPage = new LoginPage(_driver);
        loginPage.loginCred("Admin", "admin123");
        loginPage.click();
    }

    @AfterTest
    void tearDown(){
        _driver.quit();
    }
}
