package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.SeleniumUtils;

public abstract class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }
    public void printURL(){
        System.out.println(Driver.getDriver().getCurrentUrl());
    }

    public void printTitle(){
        System.out.println(Driver.getDriver().getTitle());
    }

    public void logOut(){
        WebElement profile = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
        WebElement logout = driver.findElement(By.linkText("Logout"));

        SeleniumUtils.click(driver, profile);
        logout.click();
    }

    public abstract void search(String ... parameters);
}
