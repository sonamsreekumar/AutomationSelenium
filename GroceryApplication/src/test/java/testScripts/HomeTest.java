package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base{
	@Test
	public void verifyAdminUserLogout() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameInUsernameField(usernamevalue);
		login.enterPasswordInPasswordField(passwordvalue);
		login.signButtonClick();
		HomePage home = new HomePage(driver);
		home.clickAdmin();
		home.clickLogout();
	}
}
