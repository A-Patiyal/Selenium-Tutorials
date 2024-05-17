package waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		/*
		 *  Explicit Wait: waits till element(action) or timeouts 
		 *  Default polling frequency 500ms 
		 *  Applies on a specific element to wait till perform the action on the element
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Documentation"))).click();
				driver.close();
	}
}
