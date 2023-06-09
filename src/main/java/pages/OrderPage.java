package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

import baseContainer.TestBase;
import utilities.utility;

public class OrderPage extends TestBase {
    utility utils = new utility();

    String homePageAvatarIcon = OR.getProperty("avatarIcon");
    String shopBtn = OR.getProperty("shopBtn");
    String productBtn = OR.getProperty("productBtn");
    String addtocartBtn = OR.getProperty("addtocartBtn");
    String viewcartBtn = OR.getProperty("viewcartBtn");
    String proceedTocheckoutBtn = OR.getProperty("proceedTocheckoutBtn");
    String firstnameField = OR.getProperty("firstnameField");
    String lastnameField = OR.getProperty("lastnameField");
    String phonenumberField = OR.getProperty("phonenumberField");
    String emailaddressField = OR.getProperty("emailaddressField");
    String streetField = OR.getProperty("streetField");
    String townField = OR.getProperty("townField");
    String cashOnDeliveryButton = OR.getProperty("cashondeliveryBtn");
    String placeorderBtn = OR.getProperty("placeorderBtn");
    Actions actions = new Actions(driver);

    public OrderPage(WebDriver driver) {
        TestBase.driver = driver;
        PageFactory.initElements(TestBase.driver, this);
    }

    public void clickAvatarIcon() {
        driver.findElement(By.cssSelector(homePageAvatarIcon)).click();
    }

    public void clickShopBtn() {
        driver.findElement(By.xpath(shopBtn)).click();
    }

    public void clickProductBtn() {
        driver.findElement(By.xpath(productBtn)).click();
    }

    public void clickAddtoCartBtn() {
        driver.findElement(By.xpath(addtocartBtn)).click();
    }

    public void clickViewCartBtn() {
        driver.findElement(By.xpath(viewcartBtn)).click();
    }

    public void clickProceedTocheckoutBtn() {
        scrollToView(By.xpath(proceedTocheckoutBtn));
        driver.findElement(By.xpath(proceedTocheckoutBtn)).click();
    }

    public void scrollToView(By locator) {
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).perform();
    }

    public void clickFirstnameField() {
        driver.findElement(By.id(firstnameField)).click();
    }

    public void typeInFirstnameField(String key) throws Exception {
        driver.findElement(By.id(firstnameField)).clear();
        driver.findElement(By.id(firstnameField)).sendKeys(utils.dataFetcher(key));
    }

    public void clickLastnameField() {
        driver.findElement(By.id(lastnameField)).click();
    }

    public void typeInLastnameField(String key) throws Exception {
    	driver.findElement(By.id(lastnameField)).clear();
        driver.findElement(By.id(lastnameField)).sendKeys(utils.dataFetcher(key));
    }

    public void clickStreetField() {
        driver.findElement(By.name(streetField)).click();
    }

    public void typeInStreetField(String key) throws Exception {
    	driver.findElement(By.name(streetField)).clear();
        driver.findElement(By.name(streetField)).sendKeys(utils.dataFetcher(key));
    }

    public void clickTownField() {
        driver.findElement(By.id(townField)).click();
    }

    public void typeInTownField(String key) throws Exception {
    	driver.findElement(By.id(townField)).clear();
        driver.findElement(By.id(townField)).sendKeys(utils.dataFetcher(key));
    }

    public void clickPhonenumberField() {
        scrollToView(By.name(phonenumberField));
        driver.findElement(By.name(phonenumberField)).click();
    }

    public void typeInPhonenumberField(String key) throws Exception {
    	driver.findElement(By.name(phonenumberField)).clear();
        driver.findElement(By.name(phonenumberField)).sendKeys(utils.dataFetcher(key));
    }

    public void clickEmailaddressField() {
        driver.findElement(By.name(emailaddressField)).click();
    }

    public void typeInEmailaddressField(String key) throws Exception {
    	driver.findElement(By.name(emailaddressField)).clear();
        driver.findElement(By.name(emailaddressField)).sendKeys(utils.dataFetcher(key));
    }
    
    public void clickCashOnDeliveryButton() {
        scrollToView(By.cssSelector(cashOnDeliveryButton));
        driver.findElement(By.cssSelector(cashOnDeliveryButton)).click();
    }

    public void clickPlaceorderBtn() {
        driver.findElement(By.id(placeorderBtn)).click();
    }
}
