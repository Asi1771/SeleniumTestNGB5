package tests.exapmleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class AmazonTest {
    @Test (groups = {"sanity"})
    public void amazonTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @Test (groups = {"login"})
    public void amazonTest2(){
        System.out.println("This is test 2 of amazon");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test
    public void amazonTest3(){
        System.out.println("This is test 3 of amazon");
        SeleniumUtils.waitForSeconds(3);
    }

    @Test (groups = {"loginTest"})
    public void login1(){
        System.out.println("Login to amazon test 1");
    }

    @Test
    public void login2(){
        System.out.println("login amazon test 2");
    }
}
