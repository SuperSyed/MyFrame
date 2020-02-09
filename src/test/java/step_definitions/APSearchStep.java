package step_definitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.APHomePage;
import pages.APSearchPage;
import utilities.Driver;

public class APSearchStep {
    APHomePage aPHomePage = new APHomePage();
    APSearchPage aPSearchPage = new APSearchPage();
    @Then("I click on add to cart on AP")
    public void i_click_on_add_to_cart_on_AP() {
        aPSearchPage.addToCartButtons.get(0).click();
    }
    @Then("I see proceed to checkout button is enabled on AP")
    public void i_see_proceed_to_checkout_button_is_enabled_on_AP() {
        Assert.assertTrue("Add to cart button is not enabled", aPSearchPage.proceedToCheckoutButton.isEnabled());
    }
    @Then("product title includes {string} keyword on AP")
    public void product_title_includes_keyword_on_AP(String keyword) throws InterruptedException {
        Wait wait = new WebDriverWait(Driver.getDriver(), 4000);
        wait.until(ExpectedConditions.visibilityOf(aPSearchPage.addToCartProductTitle));
        //WaitHelper.waitForVisibility(aPSearchPage.addToCartProductTitle, 4000);
        String productTitle = aPSearchPage.addToCartProductTitle.getText();
        System.out.println("********************** "+ productTitle);
        Assert.assertTrue(productTitle.toLowerCase().contains(keyword.toLowerCase()));
    }
    @Then("I see message {string}")
    public void i_see_message(String msg) {
        String sucessMessage = aPSearchPage.addToCartModalMessage.getText();
        Assert.assertEquals(sucessMessage, msg);
    }
    @Then("I clcik on list view Button on AP")
    public void iClcikOnListViewButtonOnAP() {
        aPSearchPage.listViewButton.click();
    }
}

