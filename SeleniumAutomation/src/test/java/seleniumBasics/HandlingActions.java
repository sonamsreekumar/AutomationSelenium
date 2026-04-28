package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	public void verifyRightClick()
	{
		WebElement othermenu = driver.findElement(By.id("others"));
		Actions ac = new Actions(driver);
		ac.contextClick(othermenu).build().perform();;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions rightclick = new HandlingActions();
		rightclick.browserLaunch();
		rightclick.verifyRightClick();
				

	} 	

}
