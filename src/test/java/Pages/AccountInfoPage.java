package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AccountInfoPage {

    //Web Driver
    WebDriver driver;

    // Constructor
    public AccountInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions / Methods
   // public void selectTitle(){
       // driver.findElement(By.id("id_gender2")).click();
    //}
    //public void enterPassword(String password){
      //  driver.findElement(By.id("password")).sendKeys(password);
    //}
    public void enterInfo(String password , String day , String month , String year){
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("password")).sendKeys(password);
        WebElement daysDropdown = driver.findElement(By.id("days"));
        WebElement monthDropDown = driver.findElement(By.id("months"));
        WebElement yearsDropDown = driver.findElement(By.id("years"));

        Select dropDown = new Select(daysDropdown);
        dropDown .selectByVisibleText(day);

        dropDown = new Select(monthDropDown);
        dropDown.selectByVisibleText(month);

        dropDown = new Select(yearsDropDown);
        dropDown .selectByVisibleText(year);

    }
    public void checkKeyLetter(){
        driver.findElement(By.id("newsletter")).click();
    }
    public void checkOption(){
        driver.findElement(By.id("optin")).click();
    }
    public void enterMoreDetails(String firstName , String last_name , String company ,String address1 ,String state ,String city , String zipcode , String mobile_number ){
        driver.findElement(By.id("first_name")).sendKeys(firstName);
        driver.findElement(By.id("last_name")).sendKeys(last_name);
        driver.findElement(By.id("company")).sendKeys(company);
        driver.findElement(By.id("address1")).sendKeys(address1);
        driver.findElement(By.id("state")).sendKeys(state);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipcode")).sendKeys(zipcode);
        driver.findElement(By.id("mobile_number")).sendKeys(mobile_number);
    }
    //public void enterlast_name(String last_name){
        //driver.findElement(By.id("last_name")).sendKeys(last_name);
    //}
    //public void entercompany(String company){
      //driver.findElement(By.id("company")).sendKeys(company);
    //}
    //public void enterAddress(String address1){driver.findElement(By.id("address1")).sendKeys(address1);}
    //public void state(String state){
        //driver.findElement(By.id("state")).sendKeys(state);
    //}
    //public void city(String city){
        //driver.findElement(By.id("city")).sendKeys(city);
    //}
    //public void zipcode(String zipcode){
        //driver.findElement(By.id("zipcode")).sendKeys(zipcode);
    //}
    //public void mobile_number(String mobile_number){
        //driver.findElement(By.id("mobile_number")).sendKeys(mobile_number);
    //}
    public void createAccount(){
        driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
    }

    public void validateToAccountInfo(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"login-form\"]/h2[@class=\"title text-center\"]")).isDisplayed());
       // Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"login-form\"]/h2[@class=\"title text-center\"]")).getText().contains("\"Enter Account Information\""));
    }
    public void accontCreatedIsDisplay(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]/h2[@class=\"title text-center\"]")).isDisplayed());
        //Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]/h2[@class=\"title text-center\"]")).getText().contains("Account Created!"));
    }
}

