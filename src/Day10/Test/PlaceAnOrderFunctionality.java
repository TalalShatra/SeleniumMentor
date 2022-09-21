package Day10.Test;

import Day10.POM.LoginPageElements;
import Day10.POM.PlaceOrderPageElements;
import Day10.Utilities.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceAnOrderFunctionality extends BaseDriver {

    LoginPageElements loginPageElements;
    PlaceOrderPageElements placeOrderPageElements;

    @Test
    public void successfullyPlacedOrder(){

        loginPageElements = new LoginPageElements(driver);

        loginPageElements.emailInput.sendKeys("batch6@test.com");
        loginPageElements.passwordInput.sendKeys("batch6test");
        loginPageElements.loginButton.click();

        wait.until(ExpectedConditions.visibilityOf(loginPageElements.logoutButton));

        placeOrderPageElements = new PlaceOrderPageElements(driver);

        placeOrderPageElements.secondAddToCartButton.click();

        wait.until(ExpectedConditions.visibilityOf(placeOrderPageElements.successfullyAddedMessage));

        placeOrderPageElements.shoppingCart.click();

        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/cart"));

        placeOrderPageElements.agreeButton.click();

        placeOrderPageElements.checkoutButton.click();

        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/onepagecheckout"));

        Select selectCountry = new Select(placeOrderPageElements.countryDropdown);
        selectCountry.selectByVisibleText("Canada");

        Select selectState = new Select(placeOrderPageElements.stateDropdown);
        selectState.selectByVisibleText("Ontario");

        placeOrderPageElements.cityInput.sendKeys("Brooks");

        placeOrderPageElements.address1Input.sendKeys("test address 1");

        placeOrderPageElements.zipCodeInput.sendKeys("0A5");

        placeOrderPageElements.phoneInput.sendKeys("1234567890");

        placeOrderPageElements.continueButton.click();

        placeOrderPageElements.secondConButton.click();

        placeOrderPageElements.thirdConButton.click();

        placeOrderPageElements.fourthConButton.click();

        placeOrderPageElements.fifthConButton.click();

        placeOrderPageElements.confirmButton.click();

        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/checkout/completed/"));

        String actualSuccessMessage = placeOrderPageElements.successMessage.getText();
        String expectedSuccessMessage = "Your order has been successfully processed!";

        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);

    }
}
