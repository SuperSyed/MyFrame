package step_definitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ClientMgmtPage;
public class ClientStep {
    ClientMgmtPage clientMgmtPage = new ClientMgmtPage();
    @Then("I click on edit link a record")
    public void i_click_on_edit_link_a_record() {
        clientMgmtPage.editLinks.get(0).click();
    }
    @Then("I click on save without changing anything")
    public void i_click_on_save_without_changing_anything() {
        clientMgmtPage.saveButton.click();
    }
    @Then("I should get {int} required fields warning message")
    public void i_should_get_required_fields_warning_message(int numberOfWarnings) {
        int actualNumberOfValidationMsgs = clientMgmtPage.validationMessages.size();
        Assert.assertEquals( "Not showing all warning messages",numberOfWarnings, actualNumberOfValidationMsgs);
    }
}