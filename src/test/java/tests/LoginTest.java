package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest(){
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user" , "secret_sauce");

        //Assertion(VERY IMPORTANT)
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login failed!");
    }

    @Test
    public void invalidLoginTest(){

        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("wrong_user","wrong_password");

        //verify error message is displayed
        boolean errorDisplayed = driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();

        Assert.assertTrue(loginPage.isErrorDisplayed(),
                "Error message not displayed!");    }
}
