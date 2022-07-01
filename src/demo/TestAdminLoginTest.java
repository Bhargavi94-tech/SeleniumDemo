package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdminLoginTest extends TestBaseClass {
	@Test
	public void adminLoginTest() {
		TestLoginPage lp= new TestLoginPage(driver);
		TestHomePage hp= new TestHomePage(driver);
		lp.login("Admin", "Admin");
		Boolean status=hp.verifyHomepage();
		Assert.assertTrue(status);
		hp.logout();
		
		
	}

}
