package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	public WebDriver driver;
	
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement clicknewuser;
	@FindBy(id="username")WebElement newuser;
	@FindBy(id="password")WebElement newpassword;
	@FindBy(id="user_type")WebElement selectuser;
	@FindBy(xpath="//button[@name='Create']")WebElement saveuser;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchuser;
	@FindBy(id="un")WebElement searchusername;
	@FindBy(id="ut")WebElement selectuserSearch;
	@FindBy(xpath="//button[@name='Search']")WebElement search;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")WebElement resetbutton;
	
	
	public void newUser()
	{
		clicknewuser.click();
	}
	public void enterNewUserName(String newusername)
	{
		newuser.sendKeys(newusername);
	}
	public void enterPasswordForNewUser(String passwordnewuser)
	{
		newpassword.sendKeys(passwordnewuser);
	}
	public void selectUserType()
	{
		Select select = new Select(selectuser);
		select.selectByIndex(2);
	}
	public void clickSave()
	{
		saveuser.click();
	}
	public void searchUser()
	{
		searchuser.click();
	}
	public void enterUserNameForSearch(String newusername)
	{
		searchusername.sendKeys(newusername);
	}
	public void selectUserTypeForSearch()
	{
		Select select = new Select(selectuserSearch);
		select.selectByIndex(2);
	}
	public void clickSearch()
	{
		search.click();
	}
	public void clickReset()
	{
		resetbutton.click();
	}

}
