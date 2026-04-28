package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleclick = driver.findElement(By.id("alertButton"));
		simpleclick.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public void confirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));  
		confirmalert.click(); 
		Alert al = driver.switchTo().alert();
		//al.accept();
		al.dismiss();
	}
	public void verifyPromptError()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Sonam");
		al.accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alert = new AlertHandling();
		alert.browserLaunch();
		//alert.verifySimpleAlert();
		//alert.confirmAlert();
		alert.verifyPromptError();

	}

}
