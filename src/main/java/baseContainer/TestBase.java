package baseContainer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.utility;

public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static Properties OR = new Properties();
	public static String browser;
	utility utils = new utility();
	String projectlocation = System.getProperty("user.dir");
	
	@BeforeTest
	public void setup() {
		if(driver==null) {
			try {
				fis = new FileInputStream(projectlocation+"/src/main/resources/propertyFiles/config.properties");
				config.load(fis);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException m) {
				m.printStackTrace();
			}
			
			try {
				fis = new FileInputStream(projectlocation+"/src/main/resources/propertyFiles/OR.properties");
				OR.load(fis);
			}catch (FileNotFoundException y) {
				y.printStackTrace();
			} catch (IOException k) {
				k.printStackTrace();
			}
			
			if(System.getenv("browser") != null && System.getenv("browser").isEmpty()) {
				browser = System.getenv("browser");
			} else {
				browser = config.getProperty("browser");
			}
			config.setProperty("browser", browser);
			
			if(config.getProperty("browser").equals("safari")) {
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				
			} else if (config.getProperty("browser").equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
			} else if(config.getProperty("browser").equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.get(config.getProperty("baseUrl"));
			}
		}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
