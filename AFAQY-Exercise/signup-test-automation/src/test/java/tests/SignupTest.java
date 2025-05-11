package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;
import utils.TestDataGenerator;
import io.qameta.allure.*;

@Epic("Signup Flow")
@Feature("Register New User")
public class SignupTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
    }

    @Test(description = "Sign up a new user and log out")
    @Severity(SeverityLevel.CRITICAL)
    public void testSignup() {
        String name = TestDataGenerator.getName();
        String email = TestDataGenerator.getEmail();
        String firstname = TestDataGenerator.getFirstname();
        String lastname = TestDataGenerator.getLastname();
        String password = TestDataGenerator.getPassword();
        String address = TestDataGenerator.getAddress();
        String state = TestDataGenerator.getState();
        String city = TestDataGenerator.getCity();
        String zip = TestDataGenerator.getZipcode();
        String mobile = TestDataGenerator.getMobile();

        HomePage home = new HomePage(driver);
        home.clickSignupLogin();

        SignupPage signup = new SignupPage(driver);
        signup.enterBasicDetails(name, email);
        signup.fillFullDetails(password, firstname, lastname, address, state, city, zip, mobile);
        signup.clickCreateAccount();

        ConfirmLoginPage ConfirmLogin = new ConfirmLoginPage(driver);
        ConfirmLogin.loginConfirmation();
        ConfirmLogin.clickContinue();
        
        home.logout();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
