package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.registerPatientPage;
import utilities.ConfigurationReader;

public class registerPatientStep {


    registerPatientPage registerPatient = new registerPatientPage();
    @Then("User clicks register a patient")
    public void user_clicks_register_a_patient() {
       registerPatient.registerPatientButton.click();
    }

    @And("User enters Given name")
    public void userEntersGivenName() {
        String gName = ConfigurationReader.getProperty("givenName");
        registerPatient.givenName.sendKeys(gName);

    }
    @And("User enters Family name")
    public void userEntersFamilyName() throws InterruptedException {
        String famName = ConfigurationReader.getProperty("familyName");
        registerPatient.familyName.sendKeys(famName);
        Thread.sleep(2000);
        registerPatient.familyName.sendKeys(Keys.ENTER);
        registerPatient.familyName.sendKeys(Keys.ENTER);
        registerPatient.familyName.sendKeys(Keys.ENTER);
    }

    @Then("User clicks {string} to register as male")
    public void userClicksToRegisterAsMale(String arg0) throws InterruptedException {
        registerPatient.clickMale.click();
        registerPatient.birthDate.click();

    }

    @Then("User enters Birthdate information")
    public void userEntersBirthdateInformation() {
        registerPatient.birthdateYears.sendKeys("21");
        registerPatient.birthdateMonths.sendKeys("11");
        registerPatient.address.click();

    }

    @And("User fills out contact information")
    public void userFillsOutContactInformation() {
        registerPatient.enterAddress.sendKeys("12343 testing drive");
        registerPatient.cityVillage.sendKeys("Chicago");
        registerPatient.stateProvince.sendKeys("WV");
        registerPatient.country.sendKeys("USA");
        registerPatient.postalCode.sendKeys("22030");
        registerPatient.phoneNum.click();
        registerPatient.phoneNumber.sendKeys("2023329987");
        registerPatient.relatives.click();

    }

    @And("User chooses relationship")
    public void userChoosesRelationship() {
        registerPatient.relationshipType.click();
        registerPatient.selectDoctor.click();
        registerPatient.personName.sendKeys("Andrew Miller");
        registerPatient.confirmation.click();
    }

    @Then("User confirms registration")
    public void userConfirmsRegistration() {
        registerPatient.confirmButton.click();
    }

    @Then("User clicks {string} to register as female")
    public void userClicksToRegisterAsFemale(String arg0) throws InterruptedException {
        registerPatient.clickFemale.click();
        Thread.sleep(2000);
        registerPatient.birthDate.click();
    }
}
