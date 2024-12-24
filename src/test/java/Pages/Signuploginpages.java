package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signuploginpages {

    // Web driver
    WebDriver driver;

    // constructor
    public Signuploginpages(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    //public void enterName(String name){
        //driver.findElement(By.name("name")).sendKeys(name);
    //}

    //public void enterEmail(String email){
       // driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys(email);
    //}

    public void singupButton(){

        driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
    }
    public void enternewuserdata(String name , String email){
        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();

    }
}
