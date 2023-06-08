package testcases;

import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.LoginPage;
import utilities.utility;

public class LoginTest extends TestBase {
	@Test(priority=1)
	public void invalidLogin() throws Exception {
		utility utils = new utility();
		LoginPage login = new LoginPage(driver);
		
		login.clickAvatarIcon();
		login.clickUsernameField();
		login.typeInUsernameField("invusername");
		login.clearPasswordField();
		login.typeInPasswordField("invpassword");
		login.clickSubmitButton();
	}
	
	@Test(priority=2)
	public void invalidPassword() throws Exception {
		utility utils = new utility();
		LoginPage login = new LoginPage(driver);
		
		login.clickAvatarIcon();
		login.clickUsernameField();
		login.typeInUsernameField("username");
		login.clearPasswordField();
		login.typeInPasswordField("invpassword");
		login.clickSubmitButton();
	}

	@Test(priority=3)
	public void invalidUsername() throws Exception {
		utility utils = new utility();
		LoginPage login = new LoginPage(driver);
		
		login.clickAvatarIcon();
		login.clickUsernameField();
		login.typeInUsernameField("invusername");
		login.clearPasswordField();
		login.typeInPasswordField("password");
		login.clickSubmitButton();
	}
	
	@Test(priority= 4)
	public void validLogin() throws Exception {
		utility utils = new utility();
		LoginPage login = new LoginPage(driver);
		
		login.clickAvatarIcon();
		login.clickUsernameField();
		login.clearUsernameField();
		login.typeInUsernameField("username");
		login.clearPasswordField();
		login.typeInPasswordField("password");
		login.clickSubmitButton();
	}
}
