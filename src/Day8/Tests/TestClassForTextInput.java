package Day8.Tests;

import Day8.POM.TextInputPageElement;
import Day8.Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassForTextInput extends BaseDriver {

    TextInputPageElement textInputPageElement;

    @Test
    public void validateButtonsText(){

        textInputPageElement = new TextInputPageElement(driver);
        textInputPageElement.textInput.sendKeys("automation");
        textInputPageElement.button.click();

        String actualTextForButton = textInputPageElement.button.getText();
        String expectedTextForButton = "automation";

        Assert.assertTrue(actualTextForButton.equals(expectedTextForButton));

    }
}
