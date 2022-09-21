package Day10.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");

        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();

        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/login"));

    }

    @AfterMethod
    public void quit(){

        driver.quit();
    }
}
