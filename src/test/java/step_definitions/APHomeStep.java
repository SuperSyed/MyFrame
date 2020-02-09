package step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.APHomePage;
import pages.APSearchPage;
import utilities.ConfigurationReader;
import utilities.Driver;
public class APHomeStep {
    APHomePage aPHomePage = new APHomePage();
    APSearchPage aPSearchPage = new APSearchPage();
    @Given("I'm on AP homepage")
    public void i_m_on_AP_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("apUrl"));
    }
    @Given("I search for {string} on AP")
    public void i_search_for_on_AP(String keyword) {
        aPHomePage.searchBox.sendKeys(keyword);
    }
    @Then("I click on search button on AP")
    public void i_click_on_search_button_on_AP() {
        aPHomePage.searchButton.click();
    }
}