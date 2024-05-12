package browsers.chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverClass 
{
	public static void main(String[] args) {
	
		// Creating new instance of ChromeDriver class will launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Browser Action: opens URL(below)
//		driver.get("https://www.google.com/"); // convenient way
		// or
		driver.navigate().to("https://www.google.com/"); // longer way
		
		// close ChromeDriver instance
		driver.close();	
	}
}
