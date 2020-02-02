package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class LoginStep {
     LoginPage loginPage= new LoginPage();
     HomePage homepage = new HomePage();
    static String keyword;


    @Given("I’m on the login page")
    public void i_m_on_the_login_page() {
        Driver.getDriver().get("http://app.imposta.com/");
    }

    @When("I enter  valid username as {string}")
    public void i_enter_valid_username(String uN) {
        loginPage.userNameInput.sendKeys(uN);
    }

    @When("I enter valid  password as {string}")
    public void i_enter_valid_password(String pW) {
        loginPage.passwordInput.sendKeys(pW);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("I am navigated to home page")
    public void i_am_navigated_to_home_page() {
        Assert.assertEquals( "Yoll Advisor Testing", loginPage.userInfo.getText());
    }


    @Then("I enter invalid  password")
    public void iEnterInvalidPassword() {
    }

    @Then("receive an error message")
    public void receiveAnErrorMessage() {

    }

    @Given("I’m logged in and on the home page")
    public void iMLoggedInAndOnTheHomePage() {

    }

    @Then("I click on logout button")
    public void iClickOnLogoutButton() {

    }

    @Then("I am navigated to login page")
    public void iAmNavigatedToLoginPage() {
    }

    @Given("I am successfully logged in")
    public void iAmSuccessfullyLoggedIn() {

        loginPage.login("info@conslynk.com", "Yolladvisor1");
    }


    @Given("User is on homepage")
    public void user_is_on_homepage() {

        Driver.getDriver().get("http://app.imposta.com/");
    }

    @When("User clicks client tab")
    public void user_clicks_client_tab() {
        homepage.clientsTab.click();
    }

    @When("User enters client name as {string}")
    public void user_enters_client_name_as(String name) {
        homepage.searchBox.sendKeys(name);
        keyword=name;
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        homepage.searchBtn.click();
    }

    @Then("user sees client name in results")
    public void user_sees_client_name_in_results() {
        Assert.assertTrue(homepage.firstTableResult.getText().contains(keyword));
    }

    @And("I see below tabs in the navigation")
    public void iSeeBelowTabsInTheNavigation(DataTable data) throws InterruptedException {
        Thread.sleep(2000);
        //List of maps
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        for (Map<String, String> map : maps) {
            Assert.assertTrue(Driver.getDriver().findElement(By.linkText(map.get("Tab Name"))).isDisplayed());
        }
        //For single record
        //maps.get(0).get("Tab Name");
    }

    @And("I see tab names in the navigation")
    public void iSeeTabNamesInTheNavigation(DataTable data) {
        //List of lists
        List<List<String>> lists = data.asLists(String.class);
        for (List<String> list : lists) {
            Assert.assertTrue(Driver.getDriver().findElement(By.linkText(list.get(0))).isDisplayed());
        }
    }
}
