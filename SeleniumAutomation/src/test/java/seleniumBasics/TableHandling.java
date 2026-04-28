package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	public void verifyTable()
	{
		driver.navigate().to(" https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.id("dataTable"));
		//System.out.println(table.getText());
		WebElement row4 = driver.findElement(By.xpath("//table[@id='dataTable'] /tbody/tr[4]"));
		System.out.println(row4.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling table1 = new TableHandling();
		table1.browserLaunch();
		table1.verifyTable();

	}

}
