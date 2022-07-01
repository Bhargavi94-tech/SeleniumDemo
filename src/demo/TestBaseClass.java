package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass {
	public static WebDriver driver;
	public static String URL="http://primusbank.qedgetech.com/";

	@BeforeMethod
	public void launchBrowser()	
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumDemo\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(URL);
	  // return driver;
	
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();		
	}
}
