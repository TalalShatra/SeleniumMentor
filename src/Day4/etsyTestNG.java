package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class etsyTestNG {
    WebDriver driver;

    @BeforeMethod
    public void setProperties(){

        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/?utm_source=bing&utm_medium=cpc&utm_term=etsy_e&utm_campaign=Search_US_Brand_BNG_ENG_General-Brand_Core_All_Exact&utm_ag=A1&utm_custom1=_k_4f431cdd6db11227f6a17e2ce768c82a_k_&utm_content=bing_131876476_2730742026_81638813116376_kwd-38923007297:loc-190_c_&utm_custom2=131876476&msclkid=4f431cdd6db11227f6a17e2ce768c82a");
    }
    @Test
    public void validateHeader(){
    List<WebElement> actualHeaders = driver.findElements(By.xpath("//ul[@role='menubar']//a//span"));

        ArrayList<String> expectedHeaders  = new ArrayList<>();
        expectedHeaders.add("Home Favorites");
        expectedHeaders.add("Jewelry & Accessories");
        expectedHeaders.add("Clothing & Shoes");
        expectedHeaders.add("Home & Living");
        expectedHeaders.add("Wedding & Party");
        expectedHeaders.add("Toys & Entertainment");
        expectedHeaders.add("Art & Collectibles");
        expectedHeaders.add("Craft Supplies");
        expectedHeaders.add("Gifts & Gift Cards");

        for(int i=0; i<actualHeaders.size(); i++){

            Assert.assertTrue((actualHeaders.get(i)).getText().contains(expectedHeaders.get(i)));
            System.out.println(actualHeaders.get(i).getText());
        }
    }
    @AfterMethod
    public void quitDriver(){

        driver.quit();



    }

}
