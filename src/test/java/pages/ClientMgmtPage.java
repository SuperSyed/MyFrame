package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class ClientMgmtPage {
    WebDriver driver;
    public ClientMgmtPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "button.edit-client")
    public List <WebElement> editLinks;
    @FindBy(css="button.save-button")
    public WebElement saveButton;
    @FindBy(css = ".validation-error-label")
    public List <WebElement> validationMessages;
}