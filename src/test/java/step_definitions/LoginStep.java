package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStep {
     LoginPage loginPage= new LoginPage();
     static String keyword;


    @Given("I'm on the login page")
    public void i_m_on_the_login_page() {
        String impostaUrl = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(impostaUrl);
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

    @Given("I'm successfully logged in")
    public void i_m_successfully_logged_in() {
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }


}
