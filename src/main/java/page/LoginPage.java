package page;

import utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonUtils {
    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By loginButton = By.id("btnLogin");

    public LoginPage(WebDriver _driver){
        super(_driver);
    }

    public void loginCred(String usrName, String usrPassword){
        sendKey(username, usrName);
        sendKey(password, usrPassword);
    }

    public void clickLoginButton(){
        click(loginButton);
    }
}
