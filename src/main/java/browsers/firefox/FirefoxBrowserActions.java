package browsers.firefox;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserActions 
{
	public static void main(String[] args) 
	{
		// 
		FirefoxDriver driver = new FirefoxDriver();
		
		// BrowserAction: Navigating to the below url 
		driver.get("https://www.google.com/");
		
		// closing the driver instance
		driver.close();		
	}
}
