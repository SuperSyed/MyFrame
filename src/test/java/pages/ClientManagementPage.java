package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ClientManagementPage {
    WebDriver driver;
    ClientManagementPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

}
