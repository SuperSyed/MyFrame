package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


    public class registerPatientPage {
        WebDriver driver;

        public registerPatientPage() {
            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath = "//a[starts-with(@id, 'referenceapplication-registrationapp')]")
        public WebElement registerPatientButton;

        @FindBy (name = "givenName")
        public WebElement givenName;
        @FindBy (name = "familyName")
        public WebElement familyName;
        @FindBy (xpath = "//option[contains(text(),'Male')]")
        public WebElement clickMale;
        @FindBy (xpath = "//option[contains(text(),'Female')]")
        public WebElement clickFemale;
        @FindBy (id = "birthdateLabel")
        public WebElement birthDate;
        @FindBy (id = "birthdateYears-field")
        public WebElement birthdateYears;
        @FindBy (id = "birthdateMonths-field")
        public WebElement birthdateMonths;
        @FindBy (xpath = "//span[contains(text(),'Address')]")
        public WebElement address;
        @FindBy(id = "address1")
        public WebElement enterAddress;
        @FindBy (id = "cityVillage")
        public WebElement cityVillage;
        @FindBy (id = "stateProvince")
        public WebElement stateProvince;
        @FindBy (id = "country")
        public WebElement country;
        @FindBy(id="postalCode")
        public WebElement postalCode;
        @FindBy (xpath = "//span[contains(text(),'Phone Number')]")
        public WebElement phoneNum;
        @FindBy (name = "phoneNumber")
        public WebElement phoneNumber;
        @FindBy (xpath = "//span[contains(text(),'Relatives')]")
        public WebElement relatives;
        @FindBy (id = "relationship_type")
        public WebElement relationshipType;
        @FindBy (xpath = "//option[contains(text(),'Doctor')]")
        public WebElement selectDoctor;
        @FindBy (xpath = "//input[@placeholder='Person Name']")
        public WebElement personName;
        @FindBy (id = "confirmation_label")
        public WebElement confirmation;
        @FindBy (id = "submit")
        public WebElement confirmButton;

}
