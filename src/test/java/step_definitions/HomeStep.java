package step_definitions;
import io.cucumber.java.en.*;
import pages.HomePage;
public class HomeStep {
    HomePage homePage = new HomePage();
    @Given("I click on Clients tab")
    public void i_click_on_Clients_tab() {
        homePage.clientsTab.click();
    }
}