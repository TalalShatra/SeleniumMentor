package Day9.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public void setup(String browser){

        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");
            driver = new ChromeDriver();

        }
        if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Talal\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://automationpractice.com/index.php");

        WebElement signInButton = driver.findElement(By.cssSelector("a[class='login']"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("batch6@test.com");

        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("batch6test");

        WebElement signInButtonComplete = driver.findElement(By.id("SubmitLogin"));
        signInButtonComplete.click();

        wait.until(ExpectedConditions.urlContains("my-account"));

    }
    @AfterMethod(alwaysRun = true)
    public void quitBrowser(){

        driver.quit();

    }

}
