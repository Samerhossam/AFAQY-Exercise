package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

public class ConfirmLoginPage {
	WebDriver driver;
	By accountCreated = By.cssSelector("h2[data-qa='account-created']");
	By continueButton = By.cssSelector("a[data-qa='continue-button']");

	
	public ConfirmLoginPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void loginConfirmation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement confirmation = wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreated));
		Assert.assertTrue(confirmation.isDisplayed());
	}
	
	public void clickContinue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueBtn.click();
	}
}
