package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

public class ViewEmployeeReportTest extends BaseTest {
    @Test
    void ViewEmpReport(){
        HomePage homePage = new HomePage(_driver);
        homePage.findMenuPim();
        homePage.clickSubMenuReport();
        homePage.setSearchReport("Employee Job Details");
        homePage.clickSearchButton();

        /*
        WebElement menuPim = _driver.findElement(By.xpath("//b[text()='PIM']"));
        WebElement subMenuReport = _driver.findElement(By.id("menu_core_viewDefinedPredefinedReports"));
        Actions actions = new Actions(_driver);
        actions.moveToElement(menuPim).perform();
        subMenuReport.click();
        */
        String reportName = _driver.findElement(By.xpath("//td[text()='Employee Job Details']")).getText();
        Assert.assertEquals(reportName, "Employee Job Details");
    }

    @Test
    void ViewEmpReportOne(){
        HomePage homePage = new HomePage(_driver);
        homePage.findMenuPim();
        homePage.clickSubMenuReport();
        homePage.setSearchReport("Employee Job Details");
        homePage.clickSearchButton();

        homePage.setSearchReport("Employee Job Details");
        homePage.clickSearchButton();

        String reportName = _driver.findElement(By.xpath("//td[text()='Employee Job Details']")).getText();
        Assert.assertEquals(reportName, "Employee Job Details");
    }
}
