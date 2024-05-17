package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class PageLoadTimeouts 
{
	public static void main(String[] args) {
		// 1. Open browser
		WebDriver driver = new ChromeDriver();
		
		// 2. Browser Action : navigate to a URL
		driver.get("https://www.selenium.dev/");
		
		// 3. Maximizing the current window
		driver.manage().window().maximize();
		
		/* 4. pageLoadTimout
		 * 
		 * A page load timeout specifies how long a web page should take to load in a current browsing context. 
		 * Page load timeouts are important for web development and user experience because they can prevent slow-loading pages
		 */
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		
		// 5. Applying implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// 6. find element using explicit | Fluent wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))  // setting own polling frequency
				.ignoring(NoSuchElementException.class);
		
		// 7. Perform action on the element
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Projects"))).click();
		
		// 8. Closing the driver
		driver.close();
	}
}
