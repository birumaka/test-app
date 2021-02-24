package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver _driver;

    void setUp(){
        WebDriverManager.chromedriver().setup();
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        _driver.get("https://opensource-demo.orangehrmlive.com/");

        _driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        _driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        _driver.findElement(By.id("btnLogin")).click();
    }

    void tearDown(){
        _driver.quit();
    }
}
