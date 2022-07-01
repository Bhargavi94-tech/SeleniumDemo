package seleniumtopicsdemo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTopics {
	
	@Test ()
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		//Assert.assertTrue(!driver.findElement(By.name("login")).isDisplayed());
		//Assert.assertTrue(false);
//		String expvalue="Facebook – log in or sign up";
//		String actvalue=driver.getTitle();
//		System.out.println(actvalue);
//		
//		Assert.assertEquals(actvalue,expvalue);
//		}
//		catch(Exception e) {
//			System.out.println("Exception is handled");
//		}
		//Assert.assertFalse(driver.findElement(By.name("login")).isDisplayed());
		//Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait= new WebDriverWait(driver,20);
		try {
		
//	driver.findElement(By.id("pass")).sendKeys("test");
		WebElement login=driver.findElement(By.name("login"));
//		wait.until(ExpectedConditions.visibilityOf(login));
		FluentWait wait= new FluentWait(driver);
		wait.withTimeout(30, TimeUnit.SECONDS);
		wait.pollingEvery(2, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(login));
	
		login.click();
		}
		catch(Exception e) {
			
		}
		
		
		
	}

}
