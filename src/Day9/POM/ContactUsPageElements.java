package Day9.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageElements {

    public ContactUsPageElements(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a[title='Contact Us']")
    public WebElement contactUsButton;

    @FindBy(id = "id_contact")
    public WebElement subjectDropdown;

    @FindBy(id = "message")
    public WebElement textInput;

    @FindBy(id = "submitMessage")
    public WebElement sendMessage;

    @FindBy(css = "p[class='alert alert-success']")
    public WebElement successMessage;
}
