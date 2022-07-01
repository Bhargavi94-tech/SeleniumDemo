package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestHomePage extends TestBaseClass {
	@FindBy(xpath="//img[(@src='images/admin_but_02.jpg')]") 
	private WebElement changepwd;
	
	@FindBy(xpath="//img[(@src='images/admin_but_03.jpg')]") 
	private WebElement logout;	
	WebDriverWait wait= new WebDriverWait(driver,20);	
	public boolean verifyHomepage() 
	
	{
		if(changepwd.isDisplayed()) {
			return true;
		}else {
			return false;
		}		
	}
	public void logout()  {
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
		Boolean res=driver.getCurrentUrl().contains(URL);
		Assert.assertTrue(res);
		
	}
	public TestHomePage(WebDriver driver) {
        //this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
