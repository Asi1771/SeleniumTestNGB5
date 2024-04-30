package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PIMPage {

    public PIMPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (css = "button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy (className = "firstName")
    public WebElement firstName;

    @FindBy (className = "lastName")
    public WebElement lastName;

    @FindBy (xpath = "//a[text()='Add Employee']//following::input[@class='oxd-input oxd-input--active']")
    public WebElement employeeId;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 --strong']")
    public WebElement employee;


    /**
     * this method adds randomly generated data
     */
    Faker faker = new Faker();
    public String fName = faker.name().firstName();
    public String lName = faker.name().lastName();
    public String empID = faker.idNumber().valid();

    public void addEmployee(){

        addButton.click();

        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        employeeId.clear();
        employeeId.sendKeys(empID);

        saveButton.click();

    }

}
