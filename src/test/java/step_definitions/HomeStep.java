package step_definitions;

import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class HomeStep {

    LoginPage loginPage= new LoginPage();
    HomePage homepage = new HomePage();

    @When("I click client tab")
    public void iClickClientTab() {

    }
}


