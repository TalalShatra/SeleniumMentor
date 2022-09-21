package Day9.Tests;

import Day9.POM.ContactUsPageElements;
import Day9.Utilities.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactUsFunctionalityTest extends BaseDriver {

    ContactUsPageElements contactUsPageElements;

    @Test(groups = "Regression")
    @Parameters({"message"})
    public void contactUsFunctionality(String message){

        contactUsPageElements = new ContactUsPageElements(driver);
        contactUsPageElements.contactUsButton.click();

        wait.until(ExpectedConditions.urlContains("contact"));

        Select selectSubject = new Select(contactUsPageElements.subjectDropdown);
        selectSubject.selectByVisibleText("Customer service");

        contactUsPageElements.textInput.sendKeys(message);

        contactUsPageElements.sendMessage.click();

        wait.until(ExpectedConditions.visibilityOf(contactUsPageElements.successMessage));

        String actualSuccessText = contactUsPageElements.successMessage.getText();

        Assert.assertEquals(actualSuccessText, "Your message has been successfully sent to our team.");

    }
}
