package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonBasePage;
import pages.DirectoryPage;
import pages.LoginPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class DirectoryTests {

    LoginPage loginPage = new LoginPage();
    DirectoryPage directoryPage = new DirectoryPage();
    CommonBasePage commonBasePage = new CommonBasePage();
    WebDriver driver = Driver.getDriver();

    @BeforeMethod
    public void before(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");
    }

    @Test
    public void test1(){
        SeleniumUtils.click(driver, commonBasePage.directory);
        SeleniumUtils.click(driver, directoryPage.jobTitle);
        directoryPage.hrManager.click();
        SeleniumUtils.click(driver, directoryPage.searchButton);

//        Assert.assertEquals(directoryPage.verifyTitle.getText(), "HR Manager");

        directoryPage.printURL();

    }

}
