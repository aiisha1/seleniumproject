package testcases;

import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.LoginPage;
import pages.OrderPage;

public class OrderTest extends TestBase {
	
	@Test
	public void placeOrder() throws Exception {
		LoginPage login = new LoginPage(driver);
		OrderPage order = new OrderPage(driver);
		
		// Perform login
		login.clickAvatarIcon();
		login.clickUsernameField();
		login.clearUsernameField();
		login.typeInUsernameField("username");
		login.clearPasswordField();
		login.typeInPasswordField("password");
		login.clickSubmitButton();
		
		// Place an Order
		order.clickAvatarIcon();
		order.clickShopBtn();
		order.clickProductBtn();
		order.clickAddtoCartBtn();
		order.clickViewCartBtn();
		order.clickProceedTocheckoutBtn();
		order.clickFirstnameField();
		order.typeInFirstnameField(browser);
		order.clickLastnameField();
		order.typeInLastnameField(browser);
		order.clickCountryField();
		order.selectCountryName(browser);
		order.clickStreetField();
		order.typeInStreetField(browser);
		order.clickTownField();
		order.typeInTownField(browser);
		order.clickStateField();
		order.selectStateName(browser);
		order.clickPhonenumberField();
		order.typeInPhonenumberField(browser);
		order.clickEmailaddressField();
		order.typeInEmailaddressField(browser);
		
		// Proceed to checkout
		order.clickPaymentBtn();
		order.clickPlaceorderBtn();
		 
		
		
	}
}