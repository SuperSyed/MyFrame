package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="UsernameOrEmailAddress")    //way1
    public WebElement userNameInput;

    @FindBy(name="Password")
    public WebElement passwordInput;

    @FindBy(id="LoginButton")
    public WebElement loginButton;

    @FindBy(css=".dropdown-user span")
    public WebElement userInfo;

    public void login(String username, String password){
        this.userNameInput.sendKeys(username);
        this.passwordInput.sendKeys(password);
       this.loginButton.click();
    }


}
