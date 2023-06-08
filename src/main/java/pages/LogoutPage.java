package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import utilities.utility;

public class LogoutPage extends TestBase {
	utility utils = new utility();
	
	 String logoutBtn = OR.getProperty("logoutBtn");

	public LogoutPage(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(TestBase.driver, this);
	}
	
	public void clickLogoutButton() {
		driver.findElement(By.xpath(logoutBtn)).click();
	}
}