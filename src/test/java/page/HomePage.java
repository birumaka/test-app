package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver _driver;

    By searchReport = By.xpath("//input[@id='search_search']");
    By searchButton = By.xpath("//input[@class='searchBtn']");

    public HomePage(WebDriver _driver){
        this._driver = _driver;
    }

    public void setSearchReport(String report){
        _driver.findElement(searchReport).sendKeys(report);
    }

    public void clickSearchButton(){
        _driver.findElement(searchButton).click();
    }
}
