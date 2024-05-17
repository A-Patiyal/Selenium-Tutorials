package locators.basic_locators;

/* 
 *  Syntax: driver.findElement(By.partialLinkText("Learn more")).click();
 *  Case Sensitive
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText 
{
    public static void main(String[] args) throws InterruptedException 
    {
        // 1. starts the chorme browser session
        WebDriver driver = new ChromeDriver();
        // maximizes the browser window
        driver.manage().window().maximize();
        // 2. navigates to a URL
        driver.get("https://www.selenium.dev/");

        // 3. finds the element by LinkText
        driver.findElement(By.partialLinkText("Learn more")).click(); // given partial path 
        Thread.sleep(2000); // add full text
        // 4. closes the browser
        driver.close();
        // 5. quits the browser
        driver.quit();
    }
}
