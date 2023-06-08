package testcases;

import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.utility;

public class LogoutTest extends TestBase {
	
	@Test
	public void logout() throws Exception {
		utility utils = new utility();
		LoginPage login = new LoginPage(driver);
		LogoutPage logout = new LogoutPage(driver);
		
		// Perform login
		login.clickAvatarIcon();
		login.clickUsernameField();
		login.clearUsernameField();
		login.typeInUsernameField("username");
		login.clearPasswordField();
		login.typeInPasswordField("password");
		login.clickSubmitButton();
		
		// Perform logout
		logout.clickLogoutButton();
		
	}
}
