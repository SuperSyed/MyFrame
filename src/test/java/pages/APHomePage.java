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
    @FindBy(css= "[title='Women'][class='sf-with-ul']")
    public WebElement womensTab;
    @FindBy(xpath = "(//*[@title=\"Casual Dresses\"])[1]")
    public WebElement casualDressLink;
    @FindBy(css = ".cat-name")
    public WebElement casualDressTitle;
    @FindBy(css =".rst-content .context-menu-one")
    public WebElement clickMeButton;
    @FindBy(css = ".context-menu-icon-copy")
    public WebElement copyButton;
    @FindBy(id = "box3")
    public  WebElement washington;
    @FindBy(id = "box103")
    public  WebElement unitedStates;
    @FindBy(id="age")
    public WebElement ageInputBox;
    @FindBy(css = "input[id^='RESULT_FileUpload']")
    public WebElement uploadButton2;
    @FindBy(css = ".btn-primary")
    public WebElement downloadButton;

}
