package Day10.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPageElements {

    public PlaceOrderPageElements(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@value='Add to cart'])[2]")
    public WebElement secondAddToCartButton;

    @FindBy(className = "content")
    public WebElement successfullyAddedMessage;

    @FindBy(linkText = "shopping cart")
    public WebElement shoppingCart;

    @FindBy(id = "termsofservice")
    public WebElement agreeButton;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement countryDropdown;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    public WebElement stateDropdown;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement cityInput;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement address1Input;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipCodeInput;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneInput;

    @FindBy(css = "input[title='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "(//input[@title='Continue'])[2]")
    public WebElement secondConButton;

    @FindBy(xpath = "(//input[@value='Continue'])[3]")
    public WebElement thirdConButton;

    @FindBy(xpath = "(//input[@value='Continue'])[4]")
    public WebElement fourthConButton;

    @FindBy(xpath = "(//input[@value='Continue'])[5]")
    public WebElement fifthConButton;

    @FindBy(css = "input[value='Confirm']")
    public WebElement confirmButton;

    @FindBy(tagName = "strong")
    public WebElement successMessage;
}
