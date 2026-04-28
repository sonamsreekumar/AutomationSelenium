package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	public void verifyWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement MessageBox = driver.findElement(By.id("single-input-field"));
		MessageBox.sendKeys("Test Message");
		WebElement MessageDisplay = driver.findElement(By.id("button-one"));
		MessageDisplay.click();
		WebElement msg =driver.findElement(By.id("message-one"));
		System.out.println(msg.getText());
		System.out.println(MessageDisplay.getTagName());
		MessageBox.clear();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands element = new WebElementCommands();
		element.browserLaunch();
		element.verifyWebElements();
	}

}
