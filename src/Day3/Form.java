package Day3;
// navigate to following website: https://demo.guru99.com/insurance/v1/index.php
// click on 'register' button
// fill all the inputs
// after you fill all of them, click on 'create'
// validate the url
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Form {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement registerButton = driver.findElement(By.cssSelector("a[href=\'register.php\']"));
        registerButton.click();

        WebElement titleDropdown = driver.findElement(By.id("user_title"));
        Select selectTitle = new Select(titleDropdown);
        selectTitle.selectByVisibleText("Professor");

        WebElement firstNameInput = driver.findElement(By.id("user_firstname"));
        firstNameInput.sendKeys("Ted");

        WebElement surnameInput = driver.findElement(By.id("user_surname"));
        surnameInput.sendKeys("Mosby");

        WebElement phoneInput = driver.findElement(By.id("user_phone"));
        phoneInput.sendKeys("1111111111");

        WebElement yearDropdown = driver.findElement(By.id("user_dateofbirth_1i"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("1978");

        WebElement monthDropdown = driver.findElement(By.id("user_dateofbirth_2i"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("April");

        WebElement dayDropdown = driver.findElement(By.id("user_dateofbirth_3i"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByVisibleText("25");

        WebElement licenseType = driver.findElement(By.id("licencetype_f"));
        licenseType.click();

        WebElement licensePeriod = driver.findElement(By.id("user_licenceperiod"));
        Select selectLicensePeriod = new Select(licensePeriod);
        selectLicensePeriod.selectByVisibleText("10");

        WebElement occupation = driver.findElement(By.id("user_occupation_id"));
        Select selectOccupation = new Select(occupation);
        selectOccupation.selectByVisibleText("Architect");

        WebElement addressInput = driver.findElement(By.id("user_address_attributes_street"));
        addressInput.sendKeys("Wall Street");

        WebElement cityInput = driver.findElement(By.id("user_address_attributes_city"));
        cityInput.sendKeys("NYC");

        WebElement countryInput = driver.findElement(By.id("user_address_attributes_county"));
        countryInput.sendKeys("the US");

        WebElement postCodeInput = driver.findElement(By.id("user_address_attributes_postcode"));
        postCodeInput.sendKeys("10005");

        WebElement emailInput = driver.findElement(By.id("user_user_detail_attributes_email"));
        emailInput.sendKeys("ted@mosby.com");

        WebElement passwordInput = driver.findElement(By.id("user_user_detail_attributes_password"));
        passwordInput.sendKeys("12345");

        WebElement confirmPasswordInput = driver.findElement(By.id("user_user_detail_attributes_password_confirmation"));
        confirmPasswordInput.sendKeys("12345");

        WebElement createButton = driver.findElement(By.name("submit"));
        createButton.click();

        wait.until(ExpectedConditions.urlToBe("https://demo.guru99.com/insurance/v1/index.php"));

        String actualUrl = driver.getCurrentUrl();

        String expectedUrl = "https://demo.guru99.com/insurance/v1/index.php";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("your actual url and expected url is the same!");
        }

        driver.quit();




    }
}
