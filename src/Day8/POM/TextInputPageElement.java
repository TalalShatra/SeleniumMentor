package Day8.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextInputPageElement {

    public TextInputPageElement(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "newButtonName")
    public WebElement textInput;

    @FindBy(id = "updatingButton")
    public WebElement button;

}
