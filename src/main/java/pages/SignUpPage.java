package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import utilities.utility;

public class SignUpPage extends TestBase {
	utility utils = new utility();

	String homePageAvatarIcon = OR.getProperty("avatarIcon");
	String emailField = OR.getProperty("emailField");
	String registerBtn = OR.getProperty("registerBtn");
	
	public SignUpPage(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(TestBase.driver, this);	
	}
	
	public void clickAvatarIcon() {
		driver.findElement(By.cssSelector(homePageAvatarIcon)).click();
	}
	
	public void clickEmailField() {
		driver.findElement(By.name(emailField)).click();
	}
	
	public void typeInEmailField(String key) throws Exception {
		driver.findElement(By.name(emailField)).sendKeys(utils.dataFetcher(key));
	}
	
	public void clickRegisterButton() {
		driver.findElement(By.name(registerBtn)).click();
	}
}

