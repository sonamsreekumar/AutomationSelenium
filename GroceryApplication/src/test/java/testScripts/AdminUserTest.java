package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{

	@Test
	public void verifyNewUserCreation() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		String newusername = ExcelUtility.getUserName(0, 0, "UserName");
		String passwordnewuser = ExcelUtility.getUserName(0, 1, "UserName");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameInUsernameField(usernamevalue);
		login.enterPasswordInPasswordField(passwordvalue);
		login.signButtonClick();
		HomePage home = new HomePage(driver);
		home.adminMoreInfo();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.newUser();
		adminuser.enterNewUserName(newusername);
		adminuser.enterPasswordForNewUser(passwordnewuser);
		adminuser.selectUserType();
		adminuser.clickSave();
	}
	@Test
	public void verifyNewlyAddedUserSearch() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameInUsernameField(usernamevalue);
		login.enterPasswordInPasswordField(passwordvalue);
		login.signButtonClick();
		HomePage home = new HomePage(driver);
		home.adminMoreInfo();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.searchUser();
		String newusername = ExcelUtility.getUserName(0, 0, "UserName");
		adminuser.enterUserNameForSearch(newusername);
		adminuser.selectUserTypeForSearch();
		adminuser.clickSearch();
	}
	@Test
	public void verifyUserListReset() throws IOException
	{
		String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUsernameInUsernameField(usernamevalue);
		login.enterPasswordInPasswordField(passwordvalue);
		login.signButtonClick();
		HomePage home = new HomePage(driver);
		home.adminMoreInfo();
		AdminUserPage adminuser = new AdminUserPage(driver);
		adminuser.searchUser();
		String newusername = ExcelUtility.getUserName(0, 0, "UserName");
		adminuser.enterUserNameForSearch(newusername);
		adminuser.selectUserTypeForSearch();
		adminuser.clickSearch();
		adminuser.clickReset();
	}

}
