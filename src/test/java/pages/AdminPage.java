package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage extends BasePage{

    public AdminPage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @Override
    public void search(String ... parameters) {
        String employeeName = parameters[0];
        String jobTitle = parameters[1];
        String  location = parameters[2];
    }
}
