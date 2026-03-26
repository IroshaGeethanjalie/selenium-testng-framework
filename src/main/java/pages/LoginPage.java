package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By errorMsg = By.xpath("//h3[@data-test='error']");

    //Actions
    public void enterUsername(String user){
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void ClickLogin(){
        driver.findElement(loginBtn).click();
    }

    public void login(String user, String pass){
        enterUsername(user);
        enterPassword(pass);
        ClickLogin();
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(errorMsg).isDisplayed();
    }
}
