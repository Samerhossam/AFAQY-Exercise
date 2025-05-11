package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
    WebDriver driver;

    By nameInput = By.name("name");
    By emailInput = By.xpath("//input[@data-qa='signup-email']");
    By signupBtn = By.xpath("//button[@data-qa='signup-button']");
    By passwordInput = By.id("password");
    By firstnameInput = By.id("first_name");
    By lastnameInput = By.id("last_name");
    By addressInput = By.id("address1");
    By stateInput = By.id("state");
    By cityInput = By.id("city");
    By zipcodeInput = By.id("zipcode");
    By mobileInput = By.id("mobile_number");
    By createAccountBtn = By.cssSelector("button[data-qa='create-account']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterBasicDetails(String name, String email) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(signupBtn).click();
    }

    public void fillFullDetails(String password, String firstname, String lastname, String address, String state, String city, String zip, String mobile) {
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(firstnameInput).sendKeys(firstname);
        driver.findElement(lastnameInput).sendKeys(lastname);
        driver.findElement(addressInput).sendKeys(address);
        driver.findElement(stateInput).sendKeys(state);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(zipcodeInput).sendKeys(zip);
        driver.findElement(mobileInput).sendKeys(mobile);
    }
    
    public void clickCreateAccount() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn));
   
    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", createAccountButton);
    }
}
