package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLoginPage extends TestBaseClass {

	@FindBy(id="txtuId") 
	private WebElement username;
	
	@FindBy(id="txtPword") 
	private WebElement password;
	
	@FindBy(id="login") 
	private WebElement login;	
	public void login(String uname,String pwd) 
	
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login.click();		
		
	}
	public TestLoginPage(WebDriver driver) {
        //this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
