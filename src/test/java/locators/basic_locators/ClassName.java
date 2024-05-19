package locators.basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
		
		// class Name
		int sliders = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
		driver.close();
	}
}
