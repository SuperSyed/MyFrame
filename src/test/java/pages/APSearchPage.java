package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class APSearchPage {
    WebDriver driver;
    public APSearchPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a[title='Add to cart']")
    public List<WebElement> addToCartButtons;
    @FindBy(css = "#layer_cart .layer_cart_product h2")
    public WebElement addToCartModalMessage;
    @FindBy(css = "[title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;
    @FindBy(id="layer_cart_product_title")
    public WebElement addToCartProductTitle;
    @FindBy(css = "[id='list']>a")
    public  WebElement listViewButton;
}