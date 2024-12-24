package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // Web driver
    WebDriver driver;

    // constructor

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    // Actions
    public void navigateToHomepage(){
        driver.navigate().to("http://automationexercise.com");
    }
    public void clickSignup_login(){

        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();

    }
}
