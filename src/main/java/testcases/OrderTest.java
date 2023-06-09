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
		
		// Fill order form
		order.clickFirstnameField();
		order.typeInFirstnameField("firstName");
		order.clickLastnameField();
		order.typeInLastnameField("lastName");
		order.clickStreetField();
		order.typeInStreetField("street");
		order.clickTownField();
		order.typeInTownField("town");
		order.clickPhonenumberField();
		order.typeInPhonenumberField("phoneNumber");
		order.clickEmailaddressField();
		order.typeInEmailaddressField("emailaddress");
		
		// Proceed to checkout
		order.clickCashOnDeliveryButton();
		Thread.sleep(10000);
		order.clickPlaceorderBtn();
		
	}
}