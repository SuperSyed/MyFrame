package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    WebDriver driver;
    public HomePage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#navbar-mobile span")
    public WebElement userNameOnNav;
    @FindBy(className = "dropdown-toggle")
    public WebElement accountTab;
    @FindBy(css = "[href='/Account/Logout']")
    public WebElement logoutButton;
    @FindBy(css = "a[href='/clients']")
    public WebElement clientsTab;
    @FindBy(css = "[data-dt-idx='2']")
    public WebElement secondPage;
    @FindBy(id = "DataTables_Table_0_info")
    public WebElement resultPerPage;

    @FindBy(xpath="(//*[@name='Name'])[1]")
    public WebElement searchBox;

    @FindBy(id="SearchButton")
    public WebElement searchBtn;

    @FindBy(xpath="//table[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")
    public WebElement firstTableResult;
}
