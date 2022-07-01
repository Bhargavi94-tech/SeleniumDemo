package seleniumtopicsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void launchFaceboook() {
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	}
}
