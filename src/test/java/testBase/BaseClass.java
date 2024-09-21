package testBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.commons.lang3.RandomStringUtils;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void setup() {
        
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home"); // Updated URL
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public String randomString() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    public String randomEmail() {
        return RandomStringUtils.randomAlphabetic(5) + "@yopmail.com";
    }

    public String randomPassword() {
        return RandomStringUtils.randomAlphanumeric(8);
    }
}
