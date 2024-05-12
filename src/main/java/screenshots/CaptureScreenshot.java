package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot 
{
	static WebDriver driver;
	// Using Selenium FileHandler
	public static void methodOne() throws WebDriverException, IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/v1/");
		
		// Capturing screenshot by method 1
		TakesScreenshot screen = (TakesScreenshot) driver;
		FileHandler.copy(screen.getScreenshotAs(OutputType.FILE), new File("./Screenshots/method_1.png"));
		
		driver.quit();
	}
	public static void  methodTwo() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		// capturing screenshot by metohd 2
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./Screenshots/method2.png"));
		
		driver.quit();
	}

	public static void main(String[] args) throws WebDriverException, IOException {
		methodOne();
		methodTwo();
	}
}
