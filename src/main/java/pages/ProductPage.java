package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    By addToCartbtn = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");

    public void addItemToCart(){
        driver.findElement(addToCartbtn).click();

    }
    public void goToCart(){
        driver.findElement(cartIcon).click();
    }
}
