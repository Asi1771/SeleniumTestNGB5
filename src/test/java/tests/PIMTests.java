package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonBasePage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PIMTests {
    LoginPage loginPage = new LoginPage();
    PIMPage pimPage = new PIMPage();
    CommonBasePage commonBasePage = new CommonBasePage();
    WebDriver driver = Driver.getDriver();

    @BeforeMethod
    public void before(){
        loginPage.login("Admin", "admin123");
    }

    @Test
    void verifyAdminCanCreateEmployee(){
        commonBasePage.PIMTab.click();
        pimPage.addEmployee();

        String expectedName = pimPage.fName + pimPage.lName;

        SeleniumUtils.verifyTextInElement(driver,20, pimPage.employee, expectedName);
        commonBasePage.PIMTab.click();

        WebElement id = driver.findElement(By.xpath("//div[text()='" + pimPage.employeeId+ "']"));
        WebElement firstNameInTable = driver.findElement(By.xpath("//div[text()='" +pimPage.fName +  "']/../following-sibling::div[1]"));
        WebElement lastNameInTable = driver.findElement(By.xpath("//div[text()='" +pimPage.lName +  "']/../following-sibling::div[2]"));
        SeleniumUtils.verifyTextInElement(driver,10,id,pimPage.empID);
        SeleniumUtils.verifyTextInElement(driver,10,firstNameInTable,pimPage.fName);
        SeleniumUtils.verifyTextInElement(driver,10,lastNameInTable,pimPage.lName);

    }
}
