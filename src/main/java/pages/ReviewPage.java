package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseContainer.TestBase;
import utilities.utility;

public class ReviewPage extends TestBase {
	utility utils = new utility();
    
	String shopBtn = OR.getProperty("shopBtn");
	String ProductBtn = OR.getProperty("productBtn");
	String ReviewButton = OR.getProperty("reviewBtn");
	String CommentField = OR.getProperty("commentField");
	String RatingStars = OR.getProperty("ratingStars");
	String submitReviewButton = OR.getProperty("submitReviewBtn");
    
    public ReviewPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }
    
    public void clickShopBtn() {
        driver.findElement(By.linkText(shopBtn)).click();
    }
    
    public void clickProductBtn() {
        driver.findElement(By.xpath(ProductBtn)).click();
    }
    
    public void clicKReviewButton() {
        driver.findElement(By.xpath(ReviewButton)).click();
    }
    
    public void selectRatingStars() {
        driver.findElement(By.className(RatingStars)).click();
    }
    
    public void clickCommentField() {
        driver.findElement(By.id(CommentField)).click();
    }
    public void typeInCommentField() throws Exception{
        driver.findElement(By.id(CommentField)).sendKeys(utils.dataFetcher("commentValue"));
    }
    
    public void clickSubmitReviewButton() {
        driver.findElement(By.name(submitReviewButton)).click();
    }
}