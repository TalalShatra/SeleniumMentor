package Day10.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    public LoginPageElements(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(css = "input[value='Log in']")
    public WebElement loginButton;

    @FindBy(linkText = "Log out")
    public WebElement logoutButton;

    @FindBy(className = "account")
    public  WebElement accountInfo;

    @FindBy(css = ".validation-summary-errors>span")
    public WebElement unsuccessfulLoginMessage;

    @FindBy(xpath = "//li[text()='The credentials provided are incorrect']")
    public WebElement credentialsIncorrectMessage;

    @FindBy(xpath = "//span[text()='Please enter a valid email address.']")
    public WebElement invalidEmailMessage;

    @FindBy(xpath = "//li[text()='No customer account found']")
    public WebElement noCustomerFoundMessage;
}
