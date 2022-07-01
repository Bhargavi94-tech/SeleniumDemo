package seleniumtopicsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TopicsDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDemo\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
Actions act=new Actions(driver);
//	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
//	act.contextClick(login).build().perform();
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
WebElement srele=driver.findElement(By.xpath("//div[@id='draggable']"));
//act.contextClick(srele).build().perform();
WebElement trele=driver.findElement(By.id("droppable"));
act.dragAndDrop(srele, trele).build().perform();

	}

}
