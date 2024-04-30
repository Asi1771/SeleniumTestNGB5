package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonBasePage extends BasePage{

    public CommonBasePage(){
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "PIM")
    public WebElement PIMTab;

    @FindBy(linkText = "Leave")
    public WebElement leaveTab;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboard;

    @FindBy(xpath = "//span[text()='Directory']")
    public WebElement directory;

    @Override
    public void search(String... parameters) {

    }
}
