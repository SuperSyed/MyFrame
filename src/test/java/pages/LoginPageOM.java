package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPageOM {
    WebDriver driver;

    public LoginPageOM() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "Registration Desk")
    public WebElement registrationdesk;

    @FindBy (id = "loginButton")
    public WebElement loginButton;

    @FindBy (id = "error-message")
    public WebElement errorMessage;

    @FindBy (xpath = "//a[contains(text(),'Logout')]")
    public WebElement logoutButton;



}