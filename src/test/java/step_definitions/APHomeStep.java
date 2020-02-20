package step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
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
    @Then("I hover over womens tab")
    public void i_hover_over_womens_tab() {
        Actions act = new Actions(Driver.getDriver());
        act.moveToElement(aPHomePage.womensTab).build().perform();
    }
    @Then("I click on casual dresses link")
    public void i_click_on_casual_dresses_link() {
        aPHomePage.casualDressLink.click();
    }
    @Then("I am navigated to causal dresses page")
    public void i_am_navigated_to_causal_dresses_page() {
        Assert.assertEquals(aPHomePage.casualDressTitle.getText().trim(), "CASUAL DRESSES");
    }
}