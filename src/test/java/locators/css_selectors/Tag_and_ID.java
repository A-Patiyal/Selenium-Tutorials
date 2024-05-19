package locators.css_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_and_ID 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		// Tag Name and id
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user"); // # for id
		// or 
		// driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");// tagName= input and # representing ID
		// tag name is optional
		
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		// Tag name and Class
		driver.findElement(By.cssSelector("input.btn_action")).click();
		// or
		// driver.findElement(By.cssSelector(".btn_action")).click();
		driver.close();
	}
}
