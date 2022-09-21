package Day10.Test;

import Day10.POM.LoginPageElements;
import Day10.Utilities.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Day10.Utilities.BaseDriver;

public class LoginFunctionalityPositiveScenario extends BaseDriver {
    LoginPageElements loginPageElements;

    @Test
    public void loginFunctionalityPositiveScenario(){

        loginPageElements = new LoginPageElements(driver);

        loginPageElements.emailInput.sendKeys("batch6@testing.com");
        loginPageElements.passwordInput.sendKeys("batch6test");
        loginPageElements.loginButton.click();

        wait.until(ExpectedConditions.visibilityOf(loginPageElements.logoutButton));

        String actualAccountInfoTex = loginPageElements.accountInfo.getText();
        String expectedAccountInfo = "batch6@testing.com";

        Assert.assertEquals(actualAccountInfoTex, expectedAccountInfo);

    }
}
