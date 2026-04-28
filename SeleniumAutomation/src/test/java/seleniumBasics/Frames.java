package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Frames extends Base{
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalframe=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);	
		WebElement heading = driver.findElement(By.id("sampleHeading")); 	
		System.out.println(heading.getText()); 
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames frameshandling = new Frames();
		frameshandling.browserLaunch();
		frameshandling.verifyFrames();

	}

}
