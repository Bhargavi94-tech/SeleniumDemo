package testngbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseCLass {
	public static WebDriver driver;
	public static String URL="http://primusbank.qedgetech.com/";
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}

}
