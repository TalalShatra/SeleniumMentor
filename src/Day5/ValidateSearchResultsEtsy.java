package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ValidateSearchResultsEtsy {
    WebDriver driver;

    @BeforeMethod
    public void setProperties(){

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");

        WebElement homeAndLiving = driver.findElement(By.partialLinkText("Home & Living"));

        Actions actions = new Actions(driver);
        actions.moveToElement(homeAndLiving).perform();

        WebElement office = driver.findElement(By.partialLinkText("Office"));
        office.click();
    }
    @Test
    public void catsTextIsDisplayed(){

        WebElement catsSection = driver.findElement(By.xpath("//p[text()='Cats']"));
        catsSection.click();

        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));

        String catsText = searchBox.getAttribute("value");

        Assert.assertTrue(catsText.contains("Cats"));
    }
    @Test
    public void resultsContainCat(){

        WebElement catsSection = driver.findElement(By.xpath("//p[text()='Cats']"));
        catsSection.click();

        List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));

        for (WebElement element : searchResults) {
            String textOfElement = element.getText();
            System.out.println(textOfElement);
            Assert.assertTrue(textOfElement.toLowerCase().contains("cat"));
        }
    }
    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
