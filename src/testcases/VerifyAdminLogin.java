package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.AdminHomePage;
import pageclasses.LoginPage;
import testngbaseclass.BaseCLass;

public class VerifyAdminLogin extends BaseCLass {	
	
	@Test
	public void verifyAdminLogin() {

		LoginPage lp= new LoginPage(driver);
		AdminHomePage ah= new AdminHomePage(driver);
		lp.login("Admin", "Admin");
		boolean status=ah.verifyAdminHomePage();
		Assert.assertTrue(status);
		ah.logout();
		
		
	}

}
