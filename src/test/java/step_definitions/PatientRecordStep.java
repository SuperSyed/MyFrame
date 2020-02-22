package step_definitions;

import io.cucumber.java.en.Then;
import pages.PatientRecordPage;

public class PatientRecordStep {

    PatientRecordPage patientRecord = new PatientRecordPage();

    @Then("User clicks find patient record")
    public void user_clicks_find_patient_record() {
    patientRecord.patientRecordbutton.click();
    }
}
