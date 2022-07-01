package seleniumtopicsdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class DataHandling {
	public WebDriver driver;
	@BeforeMethod
	void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
	}
	@Test (dataProvider="logindata")
	public void login(String uid,String pwd) throws InterruptedException {
		System.out.println(uid+ " "+pwd);

				driver.findElement(By.id("email")).sendKeys(uid);
				driver.findElement(By.id("pass")).sendKeys(pwd);
				WebElement login=driver.findElement(By.name("login"));
				login.click();
				Thread.sleep(5000);
	}
	@AfterMethod
	void closeBrowser() {
		driver.close();
	}
	@DataProvider
	public Object[][] logindata()   {
		Object[][]data=new Object[3][2];
		data[0][0]="testusername1";
		data[0][1]="passwordd1";
		data[1][0]="testusername2";
		data[1][1]="passwordd2";
		data[2][0]="testusername3";
		data[2][1]="passwordd3";
		return data;
		
	}
}
