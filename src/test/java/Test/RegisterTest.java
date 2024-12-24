package Test;

import Pages.AccountInfoPage;
import Pages.HomePage;
import Pages.Signuploginpages;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase{

    HomePage homepage;
    Signuploginpages signuploginpages;
    AccountInfoPage accountInfoPage;

    @BeforeClass
    public void precontions(){
        homepage =new HomePage(driver);
        signuploginpages =new Signuploginpages(driver);
        accountInfoPage = new AccountInfoPage(driver);
    }
    @Test
    public void ValidateRegister(){
        String email = "R" + System.currentTimeMillis() + "@gmail.com";
        Faker faker = new Faker();

        homepage.navigateToHomepage();
        homepage.clickSignup_login();


       //signuploginpages.enterName("Rewan");
       //signuploginpages.enterEmail("Rewan00@gmail.com");
        //signuploginpages.singupButton();
        signuploginpages.singupButton();
        signuploginpages.enternewuserdata("Rewan" , faker.internet().emailAddress() );

        //accountInfoPage.selectTitle();
        //accountInfoPage.enterPassword("1234");
        accountInfoPage.validateToAccountInfo();
        accountInfoPage.enterInfo("12345" , "14" , "July" , "1997");


        accountInfoPage.checkKeyLetter();
        accountInfoPage.checkOption();

        accountInfoPage.enterMoreDetails("Rewan" , "Magdy" , "X" , "14st" , "Egypt" , "Alex" ,"44","0125 335 4876");

        /*accountInfoPage.enterFirstName("Rewan");
        accountInfoPage.enterlast_name("Magdy");
        accountInfoPage.entercompany("Sismatix");
        accountInfoPage.enterAddress("14st");
        accountInfoPage.state("Egypt");
        accountInfoPage.city("Alex");
        accountInfoPage.zipcode("44");
        accountInfoPage.mobile_number("0125 335 4876");*/

        accountInfoPage.createAccount();
        accountInfoPage.accontCreatedIsDisplay();


    }
}
