package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class APHomePage {
    WebDriver driver;
    public APHomePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search_query_top")
    public WebElement searchBox;
    @FindBy(name="submit_search")
    public WebElement searchButton;
}