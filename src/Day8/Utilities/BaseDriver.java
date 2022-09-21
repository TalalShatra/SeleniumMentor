package Day8.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriver driver;

    @BeforeMethod
    @Parameters({"browser"})
    public void setup(String browser) {

        if(browser.equals("chrome")){

            System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");

            driver = new ChromeDriver();
        }
        if(browser.equals("firefox")){

            System.setProperty("webdriver.gecko.driver", "C:\\Talal\\geckodriver.exe");

            driver = new FirefoxDriver();

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://uitestingplayground.com/textinput");


    }

    @AfterMethod
    public void quitBrowser(){

        driver.quit();
    }

}
