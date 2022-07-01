package seleniumtopicsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void launchFaceboook() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	Thread.sleep(5000);
	}
	
}
