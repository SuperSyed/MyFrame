package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import pages.LoginPage;
import pages.LoginPageOM;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginStepOM {
    LoginPageOM loginPageOM = new LoginPageOM();
    @Before
    public void setUp(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }

    @Given("User navigate to OpenMrs login page")
    public void user_navigate_to_OpenMrs_login_page() {
        String openMrsUrl = ConfigurationReader.getProperty("OpenMrsUrl");
        Driver.getDriver().get(openMrsUrl);
    }

    @Then("User enters username")
    public void user_enters_username() {
        String uN = ConfigurationReader.getProperty("UN");
        loginPageOM.userNameInput.sendKeys(uN);
    }

    @Then("User enters password")
    public void user_enters_password() {
        String pW = ConfigurationReader.getProperty("PW");
        loginPageOM.passwordInput.sendKeys(pW);
    }

    @Then("User selects registration desk")
    public void user_selects_registration_desk() {
        loginPageOM.registrationdesk.click();
    }

    @Then("User clicks login button")
    public void user_clicks_login_button() {
        loginPageOM.loginButton.click();

    }

    @Then("User enters wrong username")
    public void userEntersWrongUsername() {
        String wronguN = ConfigurationReader.getProperty("WUN");
        loginPageOM.userNameInput.sendKeys(wronguN);

    }

    @And("User enters wrong password")
    public void userEntersWrongPassword() {
        String wrongpW = ConfigurationReader.getProperty("WPW");
        loginPageOM.passwordInput.sendKeys(wrongpW);
    }
    @Then("User sees error message")
    public void userSeesErrorMessage() {
        String errorMessage = loginPageOM.errorMessage.getText();
        boolean error = errorMessage.contains("Invalid username/password. Please try again.");
        Assert.assertTrue(error);
        System.out.println(error);
        System.out.println(errorMessage);
        Assert.assertEquals(loginPageOM.errorMessage.getText().trim(),"Invalid username/password. Please try again.");
    }

    @Then("User logs out")
    public void userLogsOut() throws InterruptedException {
        //Thread.sleep(2000);
        loginPageOM.logoutButton.click();

    }


    @Given("User navigates to OpenMrs login page and logged in")
    public void userNavigatesToOpenMrsLoginPageAndLoggedIn() {
        String openMrsUrl = ConfigurationReader.getProperty("OpenMrsUrl");
        Driver.getDriver().get(openMrsUrl);
        String uN = ConfigurationReader.getProperty("UN");
        loginPageOM.userNameInput.sendKeys(uN);
        String pW = ConfigurationReader.getProperty("PW");
        loginPageOM.passwordInput.sendKeys(pW);
        loginPageOM.registrationdesk.click();
        loginPageOM.loginButton.click();
    }
}
