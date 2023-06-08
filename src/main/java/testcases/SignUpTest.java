package testcases;

import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.SignUpPage;
import utilities.utility;

public class SignUpTest extends TestBase {
	
	@Test
	public void validCredentials() throws Exception {
		utility utils = new utility();
		SignUpPage sign = new SignUpPage(driver);
		
		sign.clickAvatarIcon();
		sign.clickEmailField();
		sign.typeInEmailField("email");
		sign.clickRegisterButton();
	}

}
