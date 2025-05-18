package tests;

import base.BaseWebTest;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pages.LoginPage;
import org.testng.annotations.Test;
import pages.LoginPageLabs;

public class LoginTest extends BaseWebTest {

    @Test
    public void testValidLogin() {
        LoginPageLabs loginPage = new LoginPageLabs(driver);
        //Validate userLogin
        loginPage.login("standard_user","secret_sauce");

        // Add assertions to verify successful login
        Assert.assertTrue(loginPage.isLoginComplete(), "Login was successful");
    }
}
