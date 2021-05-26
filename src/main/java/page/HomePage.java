package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver _driver;

    By menuPIM = By.xpath("//b[text()='PIM']\"");
    By subMenuReport = By.id("menu_core_viewDefinedPredefinedReports");
    By searchReport = By.xpath("//input[@id='search_search']");
    By searchButton = By.xpath("//input[@class='searchBtn']");

    public HomePage(WebDriver _driver){
        this._driver = _driver;
    }

    public void findMenuPim(){
        _driver.findElement(menuPIM);
    }

    public void getSubMenuReport(){
        _driver.findElement(subMenuReport);
    }

    public void setSearchReport(String report){
        _driver.findElement(searchReport).sendKeys(report);
    }

    public void clickSearchButton(){
        _driver.findElement(searchButton).click();
    }
}
