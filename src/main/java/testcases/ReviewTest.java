package testcases;

import org.testng.annotations.Test;

import baseContainer.TestBase;
import pages.LoginPage;
import pages.OrderPage;
import pages.ReviewPage;

public class ReviewTest extends TestBase {
	
	@Test
	public void ReviewProduct() throws Exception {
		LoginPage login = new LoginPage(driver);
		OrderPage order = new OrderPage(driver);
		ReviewPage review = new ReviewPage(driver);
		
		// Perform login
		login.clickAvatarIcon();
		login.clickUsernameField();
		login.clearUsernameField();
		login.typeInUsernameField("username");
		login.clearPasswordField();
		login.typeInPasswordField("password");
		login.clickSubmitButton();
		
		// Review Product
		review.clickShopBtn();
		review.clickProductBtn();
		review.clicKReviewButton();
		review.selectRatingStars();
		review.typeInCommentField();
		review.clickSubmitReviewButton();
	
		
	}
}
