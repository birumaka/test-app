package page;

import utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonUtils {
    By menuPIM = By.xpath("//b[text()='PIM']");
    By subMenuReport = By.id("menu_core_viewDefinedPredefinedReports");
    By searchReport = By.xpath("//input[@id='search_search']");
    By searchButton = By.xpath("//input[@class='searchBtn']");

    public HomePage(WebDriver _driver){
        super(_driver);
    }

    public void setSearchReport(String report){
        sendKey(searchReport, report);
    }

    public void clickSearchButton(){
        click(searchButton);
    }

    public void findMenuPim(){
        action(menuPIM);
    }

    public void clickSubMenuReport(){
        click(subMenuReport);
    }
}
