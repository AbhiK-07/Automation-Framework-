package pages;

import base.BaseWebTest;
import base.Locator;
import base.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLabs{
    WebDriver driver;
    public LoginPageLabs(WebDriver driver) {
        this.driver = driver;
    }

    public static final Locator USERNAME = new Locator("Username Field", By.id("user-name"));
    public static final Locator PASSWORD = new Locator("Password Field", By.id("password"));
    public static final Locator LOGIN_BUTTON = new Locator("Login Button", By.id("login-button"));
    public static final Locator PRODUCTS_LABEL = new Locator("Products Label", By.xpath("//div[@class='product_label']"));
    public void login(String user, String pass) {
        driver.get("https://www.saucedemo.com/v1/");
        WebElement Username = driver.findElement(USERNAME.by());
        Utility.waitForElementVisible(Username, 2);
        Username.sendKeys(user);
        WebElement Password = driver.findElement(PASSWORD.by());
        Utility.waitForElementVisible(Password, 2);
        Password.sendKeys(pass);
        WebElement LoginBtn = driver.findElement(LOGIN_BUTTON.by());
        LoginBtn.click();
    }

    public boolean isLoginComplete() {
        WebElement Products = driver.findElement(PRODUCTS_LABEL.by());
        Utility.waitForElementVisible(Products, 3);
        return Utility.isElementVisible(Products);
    }
}
