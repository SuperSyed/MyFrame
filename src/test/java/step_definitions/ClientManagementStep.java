package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class ClientManagementStep {

    LoginPage loginPage= new LoginPage();
    HomePage homepage = new HomePage();


    @And("I click create new client button")
    public void iClickCreateNewClientButton() {
    }

    @And("I select option {string}")
    public void iSelectOptionPersonal(String option) {
    }

    @And("I enter first name and last name in modal window")
    public void iEnterFirstNameAndLastNameInModalWindow() {

    }

    @And("I populate contact person dropdown")
    public void iPopulateContactPersonDropdown() {

    }

    @And("I click on save button")
    public void iClickOnSaveButton() {

    }

    @Then("I see client in data table")
    public void iSeeClientInDataTable() {
    }
}
