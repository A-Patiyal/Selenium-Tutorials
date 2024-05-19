package locators.basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
		
		// Tag Name
		int linksSize = driver.findElements(By.tagName("a")).size();
		System.out.println(linksSize);
		driver.close();
	}
}
