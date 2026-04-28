package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{
	
	public void verifyDropDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//dropdown will be under select tag
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
		//select by index for dropdown
		//select.selectByIndex(2);
		
		//select by value
		//select.selectByValue("c#");
		
		//select by visibletext
		select.selectByVisibleText("SQL");
	}
	public void verifyCheckBox()
	{
		//driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='option-2']"));
		checkbox.click();
	}
	public void verifyRadioButton()
	{
		//driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobtn = driver.findElement(By.xpath("//input[@type='radio' and @value='orange']"));
		radiobtn.click();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropDown drpdwnlist = new HandlingDropDown();
		drpdwnlist.browserLaunch();
		drpdwnlist.verifyDropDown();
		drpdwnlist.verifyCheckBox();
		drpdwnlist.verifyRadioButton();
	}

}
