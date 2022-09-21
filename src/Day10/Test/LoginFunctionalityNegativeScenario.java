package Day10.Test;
import Day10.POM.LoginPageElements;
import Day10.Utilities.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginFunctionalityNegativeScenario extends BaseDriver{

    LoginPageElements loginPageElements;

    @Test
    public void unsuccessfulLoginWithCorrectEmailAndIncorrectPassword(){

        loginPageElements = new LoginPageElements(driver);

        loginPageElements.emailInput.sendKeys("batch6@test.com");
        loginPageElements.passwordInput.sendKeys("incorrectPassword");
        loginPageElements.loginButton.click();

        String actualUnsuccessfulLoginMess = loginPageElements.unsuccessfulLoginMessage.getText();
        String expectedUnsuccessfulLoginMess = "Login was unsuccessful. Please correct the errors and try again.";

        Assert.assertEquals(actualUnsuccessfulLoginMess, expectedUnsuccessfulLoginMess);

        String actualCredentialsIncorrectMess = loginPageElements.credentialsIncorrectMessage.getText();
        String expectedCredentialsIncorrectMess = "The credentials provided are incorrect";

        Assert.assertEquals(actualCredentialsIncorrectMess, expectedCredentialsIncorrectMess);

    }

    @Test
    public void unsuccessfulLoginWithIncorrectEmailAndCorrectPassword(){

        loginPageElements = new LoginPageElements(driver);

        loginPageElements.emailInput.sendKeys("batch6Incorrect@test.com");
        loginPageElements.passwordInput.sendKeys("batch6test");
        loginPageElements.loginButton.click();

        String actualUnsuccessfulLoginMess = loginPageElements.unsuccessfulLoginMessage.getText();
        String expectedUnsuccessfulLoginMess = "Login was unsuccessful. Please correct the errors and try again.";

        Assert.assertEquals(actualUnsuccessfulLoginMess, expectedUnsuccessfulLoginMess);

        String actualCredentialsIncorrectMess = loginPageElements.noCustomerFoundMessage.getText();
        String expectedCredentialsIncorrectMess = "No customer account found";

        Assert.assertEquals(actualCredentialsIncorrectMess, expectedCredentialsIncorrectMess);

    }

    @Test
    public void unsuccessfulLoginWithInvalidEmailAndValidPassword(){

        loginPageElements = new LoginPageElements(driver);

        loginPageElements.emailInput.sendKeys("batch6Invalid.com");
        loginPageElements.passwordInput.sendKeys("batch6test");
        loginPageElements.loginButton.click();

        String actualInvalidEmailMess = loginPageElements.invalidEmailMessage.getText();
        String expectedInvalidEmailMess = "Please enter a valid email address.";

        Assert.assertEquals(actualInvalidEmailMess, expectedInvalidEmailMess);

    }
}
