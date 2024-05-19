package locators.css_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Class_and_Attribute 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		// Tag, class and attribute
		driver.findElement(By.cssSelector("input.form_input[id=user-name]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input.form_input[id=password]")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[type=submit]")).click();

		driver.close();
	}
}
