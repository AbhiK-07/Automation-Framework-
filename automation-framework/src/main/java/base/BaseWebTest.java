package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseWebTest {
    public WebDriver driver;

    @BeforeClass
    public void setupWeb() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Utility.setDriver(driver);
    }

    @AfterClass
    public void teardownWeb() {
        if (driver != null) driver.quit();
    }
}
