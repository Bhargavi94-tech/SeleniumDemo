package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import testngbaseclass.BaseCLass;

public class AdminHomePage extends BaseCLass{
	
	@FindBy(xpath="//img[@src='images/admin_but_03.jpg']")
	private WebElement logout;
	@FindBy(xpath="//img[@src='images/admin_but_02.jpg']")
	private WebElement changepwd;
	
	WebDriverWait wait= new WebDriverWait(driver,20);
	
	public void logout() {
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
		boolean res=driver.getCurrentUrl().contains(URL);
		Assert.assertTrue(res);
		//Assert.assertTrue(res);
	}
	
	public boolean verifyAdminHomePage() {
		if(changepwd.isDisplayed()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public AdminHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	

}
