package seleniumtopicsdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.findElement(By.id("win2")).click();
		
		String parentid=driver.getWindowHandle();
		Set<String>allwinids=driver.getWindowHandles();
		Iterator<String>I=allwinids.iterator();
		while(I.hasNext()) {
			String childid=I.next();
			if(!parentid.equalsIgnoreCase(childid)) {
				driver.switchTo().window(childid);
				String childwintitle=driver.switchTo().window(childid).getTitle();
				System.out.println(childwintitle);
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("gmail");
				driver.close();
				
				
			}
			
		}
		driver.switchTo().window(parentid);
		driver.findElement(By.id("enterText")).sendKeys("test");
		
		

	}

}
