package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PatientRecordPage;
import utilities.ConfigurationReader;

public class PatientRecordStep {

    PatientRecordPage patientRecord = new PatientRecordPage();

    @Then("User clicks find patient record")
    public void user_clicks_find_patient_record() {
    patientRecord.patientRecordbutton.click();
    }

    @And("User is able to search patient record by a name")
    public void userIsAbleToSearchPatientRecordByAName() throws InterruptedException {
        String sName = ConfigurationReader.getProperty("searchName");
        Thread.sleep(2000);
        patientRecord.searchBox.sendKeys(sName);
    }

    @Then("User is able to click next on the page")
    public void userIsAbleToClickNextOnThePage() throws InterruptedException {
        Thread.sleep(2000);
        patientRecord.nextPage.click();
    }

    @And("User is able to click last on the page")
    public void userIsAbleToClickLastOnThePage() throws InterruptedException {
        Thread.sleep(2000);
        patientRecord.lastPage.click();
    }

    @And("User clicks the searched patient's name")
    public void userClicksTheSearchedPatientSName() throws InterruptedException {
        Thread.sleep(2000);
        patientRecord.patientName.click();
        
    }

    @Then("User lands on patient dashboard")
    public void userLandsOnPatientDashboard() {
        patientRecord.generalAction.getText();
        System.out.println(patientRecord.generalAction.getText());

    }

    @And("User can delete patient")
    public void userCanDeletePatient() {
        patientRecord.deletePatient.click();
        patientRecord.deleteReason.sendKeys("testing purpose");
        patientRecord.confirmDelete.click();
    }
}
