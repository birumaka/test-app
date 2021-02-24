package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver _driver;

    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By loginButton = By.id("btnLogin");

    public LoginPage(WebDriver _driver){
        this._driver = _driver;
    }
    public void loginCred(String usrName, String usrPassword){
        _driver.findElement(username).sendKeys(usrName);
        _driver.findElement(password).sendKeys(usrPassword);
    }

    public void click(){
        _driver.findElement(loginButton).click();
    }

}
