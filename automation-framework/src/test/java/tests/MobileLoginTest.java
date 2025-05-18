package tests;

import base.BaseMobileTest;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MobileLoginTest extends BaseMobileTest {

    @Test
    public void testLogin() {

        WebElement username = driver.findElement(By.id("com.example:id/username"));
        username.sendKeys("testuser");
    }
}
