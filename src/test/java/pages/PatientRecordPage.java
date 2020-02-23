package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientRecordPage {
    WebDriver driver;

    public PatientRecordPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "icon-search")
    public WebElement patientRecordbutton;
    @FindBy(id = "patient-search")
    public WebElement searchBox;
    @FindBy (id = "patient-search-results-table_next")
    public WebElement nextPage;
    @FindBy (id = "patient-search-results-table_last")
    public WebElement lastPage;
    @FindBy (xpath = "//tr[1]//td[2]")
    public WebElement patientName;
    @FindBy (xpath =  "//h3[contains(text(),'General Actions')]")
    public WebElement generalAction;
    @FindBy (id = "org.openmrs.module.coreapps.deletePatient")
    public WebElement deletePatient;
    @FindBy (id = "delete-reason")
    public WebElement deleteReason;
    @FindBy (xpath = "//div[@id='delete-patient-creation-dialog']//button[@class='confirm right'][contains(text(),'Confirm')]")
    public WebElement confirmDelete;
}
