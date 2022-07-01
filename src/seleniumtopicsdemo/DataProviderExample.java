package seleniumtopicsdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	public WebDriver driver;
	
	@DataProvider
	public Object[][] loginData() {
		Object[][] data=new Object[4][2];
		data[0][0]="testusername1";
		data[0][1]="testpassword1";
		data[1][0]="testusername2";
		data[1][1]="testpassword2";
		data[2][0]="testusername3";
		data[2][1]="testpassword3";
		data[3][0]="testusername4";
		data[3][1]="testpassword4";		
		return data;
	}
@BeforeMethod
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://facebook.com");
	
}
@AfterMethod
public void closeBrowser() {
	driver.close();

}
	
	
	@Test (dataProvider="loginData")
	void loginTest(String uid,String pwd) throws InterruptedException   {
		//System.out.println(uid + " "+ pwd);		
		driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(7000);
		//WebElement login=driver.findElement(By.name("login"));
		
		
		
	}
}
