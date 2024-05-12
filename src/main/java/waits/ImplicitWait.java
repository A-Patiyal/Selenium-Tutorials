package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// maximizes the browser window
		driver.manage().window().maximize();
		
		/*
		 * implicit wait : Applies on entire WebDriver session means on all elements
		 * Default polling frequency is 500ms or 1 seconds based on different browsers
		 * Recommended wait (As soon as the element found driver performs the action immediately)
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // waits until elements or timeouts(given time)
		
		// navigating to a URL
		driver.get("https://www.google.com/");
	}
}
