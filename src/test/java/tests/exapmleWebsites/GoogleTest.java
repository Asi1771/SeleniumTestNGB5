package tests.exapmleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class GoogleTest {

    @BeforeTest (groups = {"sanity"})
    public static void beforeTestMethod(){
        System.out.println("THIS IS BEFORE TEST IN GOOGLE TEST");
    }

    @BeforeGroups (groups = {"sanity"})
    public static void beforeGroup(){
        System.out.println("This is Before Group in Google");
    }

    @Test
    public void googleTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @Test (groups = {"login"})
    public void googleTest2(){
        System.out.println("Test 2 of Google");
    }

    @Test (groups = {"sanity"})
    public void googleTest3(){
        System.out.println("Test 3 of Google");
    }

    @Test (groups = {"loginTest"})
    public void login1(){
        System.out.println("login google test 1");
    }
    @Test
    public void login2(){
        System.out.println("login google test 2");
    }

    @BeforeSuite
    public static void beforeSuiteMethod(){
        System.out.println("THIS IS BEFORE SUITE INSIDE GOOGLE");
    }

    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("THIS IS AFTER SUITE INSIDE GOOGLE");
    }

    @AfterTest
    public static void afterTestMethod(){
        System.out.println("THIS IS AFTER TEST IN GOOGLE TEST");
    }

    @AfterGroups
    public static void afterGroup(){
        System.out.println("This is After Group in Google");
    }
}


