package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base {
	
	public void verifyLocators()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.partialLinkText("Select"));
		driver.findElement(By.cssSelector("button[id='button-one']"));  //tagname[attribute='attribute value']
		
		/* absolute xpath
		/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button
		*/
		//Relative xpath
		//tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//button[@id='button-two']"));
		//xpath by text
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		
		//xpath using and operator
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button'] ")); 
		
		//xpath using or operator
		driver.findElement(By.xpath(" //button[@id='button-one' or @id='button-one-electronics']"));
		
		//xpath if multiple elements are present, so taking surrounding value and locating the element
		driver.findElement(By.xpath(" //div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		
		//xpath by child
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		
		//xpath by following - whatever comes after id will be selected
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		
		//xpath by following - whatever comes before id will be selected
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		
		//xpath for finding the ancestor after locating an element
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
		//xpath for finding the descendant after locating an element
		driver.findElement(By.xpath(" //div[@class='card']//descendant::div"));
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
