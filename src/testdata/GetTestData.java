package testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class GetTestData {
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
//	public void excelHandling() throws IOException  {
//		//System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
//		//WebDriver driver=new ChromeDriver();
////		driver.get("https://facebook.com");
////		driver.findElement(By.id("email")).sendKeys("testusername");
////		driver.findElement(By.id("pass")).sendKeys("testpwd");
////		WebElement login=driver.findElement(By.name("login"));
//		FileInputStream fi= new FileInputStream("E:\\LoginInputs.xlsx");
//		
//		Workbook wb= new XSSFWorkbook(fi);
//		Sheet ws=wb.getSheet("Login");
//		int rc=ws.getLastRowNum();
//		Row r,r1;
//		Cell c1,c2,c3;
//		String username,pwd;		
//		System.out.println(rc);
//		for(int i=0;i<rc;i++) {
//			r=ws.getRow(i);
//			c1=r.getCell(0);
//			c2=r.getCell(1);
//			username=c1.getStringCellValue();
//			pwd=c2.getStringCellValue();
//			System.out.println(username+ " "+pwd);						
//		}
//		r1=ws.getRow(1);
//		c3=r1.createCell(2);
//		c3.setCellValue("Pass");
//		FileOutputStream fo= new FileOutputStream("E:\\LoginInputs.xlsx");
//		wb.write(fo);
//		fo.close();
//		fi.close();
//		wb.close();
//		
//		
//		
//	}

}
