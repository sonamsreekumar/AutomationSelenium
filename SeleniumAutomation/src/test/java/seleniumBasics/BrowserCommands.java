package seleniumBasics;

public class BrowserCommands extends Base{
	public void verifyBrowserCommand()
	{
		//fetch title
		String title = driver.getTitle(); 
		System.out.println(title);
		
		// fetch url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String handleId = driver.getWindowHandle();
		System.out.println(handleId);
		
		String source = driver.getPageSource();
		System.out.println(source);
	}
	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands command = new BrowserCommands();
		command.browserLaunch();
		//brc.verifyBrowserCommand();
		command.verifyNavigationCommands();
	}

}
