package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonUtils {
    private WebDriver _driver;

    public CommonUtils(WebDriver _driver) {
        this._driver = _driver;
    }

    public void navigateToUrl(String url){
        this._driver.navigate().to(url);
    }

    public WebElement getElement(By selector){
        try {
            return _driver.findElement(selector);
        } catch (Exception e){
            System.out.printf("Element %s does not found%n", selector);
        }
        return null;
    }

    public void click(By selector){
        WebElement element = getElement(selector);
        try {
            element.click();
        } catch (Exception e){
            System.out.printf("Unable to click %s%n", selector);
            e.printStackTrace();
        }
    }

    public void sendKey(By selector, String text){
        WebElement element = getElement(selector);
        element.clear();
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            System.out.printf("Could not enter the value in the %s field", selector);
        }
    }

    public void action(By selector){
        WebElement element = getElement(selector);
        try {
            Actions actions = new Actions(_driver);
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.printf("Could not perform action due to %s", selector);
        }
    }

    public String getText(By selector){
        WebElement element = getElement(selector);
        try {
            element.getText();
        } catch (Exception e){
            System.out.printf("Could not get text of element %s", selector);
        }
        return null;
    }
}
