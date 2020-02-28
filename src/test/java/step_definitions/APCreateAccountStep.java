package step_definitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.APHomePage;
import pages.APHomePage;
import utilities.Driver;
public class APCreateAccountStep {
    APHomePage apCreateAcntPage= new APHomePage();
    APHomePage aPHomePage = new APHomePage();
    Faker faker = new Faker();
    String firstName, lastName;
    @Then("I click on Sign in button in AP")
    public void i_click_on_Sign_in_button_in_AP() {
        aPHomePage.signInButton.click();
    }
    @Then("I enter email address to create an Account in AP")
    public void i_enter_email_address_to_create_an_Account_in_AP() {
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        apCreateAcntPage.emailInputBox.sendKeys(firstName+"."+lastName+"@email.com");
    }
    @Then("I click on the CREATE AN ACCOUNT button in AP")
    public void i_click_on_the_CREATE_AN_ACCOUNT_button_in_AP() {
        apCreateAcntPage.createAccountBtn.click();
    }
    @Then("I fill out all the required fields in AP")
    public void i_fill_out_all_the_required_fields_in_AP() {
        apCreateAcntPage.firstname.sendKeys(firstName);
        apCreateAcntPage.lastname.sendKeys(lastName);
        apCreateAcntPage.password.sendKeys("test1234");
        apCreateAcntPage.streetName.sendKeys(faker.address().streetAddress());
        apCreateAcntPage.cityName.sendKeys(faker.address().cityName());
        Select stateOption = new Select(apCreateAcntPage.stateName);
        stateOption.selectByVisibleText("Pennsylvania");
        apCreateAcntPage.zipCode.sendKeys("20004");
//        Select countryOption = new Select(apCreateAcntPage.countryName);
//        countryOption.selectByIndex(1);
        apCreateAcntPage.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
    }
    @Then("I click on Register button in AP")
    public void i_click_on_Register_button_in_AP() {
        apCreateAcntPage.registerButton.click();
    }
    @Then("my account is created")
    public void my_account_is_created() {
        // Assert.assertTrue(apCreateAcntPage.pageHeading.isDisplayed());
        Assert.assertEquals("MY ACCOUNT", apCreateAcntPage.pageHeading.getText());
    }
}