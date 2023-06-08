package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;

import utilities.utility;

public class LoginPage extends TestBase {
	utility utils = new utility();
	
	String homePageAvatarIcon = OR.getProperty("avatarIcon");
	String usernameField = OR.getProperty("usernameField");
	String passwordField =  OR.getProperty("passwordField");
	String submitBtn = OR.getProperty("submitBtn");
	
	public LoginPage(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(TestBase.driver, this);	
	}
	
	public void clickAvatarIcon() {
		driver.findElement(By.cssSelector(homePageAvatarIcon)).click();
	}
	
	public void clickUsernameField() {
		driver.findElement(By.name(usernameField)).click();
	}
	
	public void typeInUsernameField(String key) throws Exception {
		driver.findElement(By.name(usernameField)).sendKeys(utils.dataFetcher(key));	
	}
	
	public void clearUsernameField() {
		driver.findElement(By.name(usernameField)).clear();
	}
	
	public void clickPasswordField() {
		driver.findElement(By.id(passwordField)).click();
	}
	
	public void typeInPasswordField(String key) throws Exception {
		driver.findElement(By.id(passwordField)).sendKeys(utils.dataFetcher(key));	
	}
	
	public void clearPasswordField() {
		driver.findElement(By.id(passwordField)).clear();
	}
	
	public void clickSubmitButton() {
		driver.findElement(By.name(submitBtn)).click();
	}
}
