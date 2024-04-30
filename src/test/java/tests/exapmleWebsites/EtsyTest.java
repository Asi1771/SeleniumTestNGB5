package tests.exapmleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import utilities.Driver;

public class EtsyTest {
    @Test (groups = {"sanity"})
    public void etsyTest1(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.etsy.com/");
    }
    @Test (groups = {"login"})
    public void etsyTest2(){
        System.out.println("Test 2 of Etsy");
    }

    @Test
    public void etsyTest3(){
        System.out.println("Test 3 of Etsy");
    }

    @Test (groups = {"loginTest"})
    public void login1(){
        System.out.println("login test etsy 1");
    }

    @Test
    public void login2(){
        System.out.println("login test etsy 2");
    }
}





