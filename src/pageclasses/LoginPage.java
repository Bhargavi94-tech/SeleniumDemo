package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngbaseclass.BaseCLass;

public class LoginPage extends BaseCLass{
	
	@FindBy(name="txtuId")
	private WebElement username;
	
	@FindBy(id="txtPword")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	
	@FindBy(xpath="//a[contains(@href,'customerServices')]")
	private WebElement custservice;
	
	@FindBy(linkText="Privacy")
	private WebElement privacy;
	
	@FindBy(linkText="Dismiss")
	private WebElement dismiss;
		
	public void login(String uname,String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();		
		
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

}
