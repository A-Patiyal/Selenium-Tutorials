package locators.basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
    public static void main(String[] args) throws InterruptedException {
        // 1. starts the chorme browser session
        WebDriver driver = new ChromeDriver();
        // maximizes the browser window
        driver.manage().window().maximize();
        // 2. navigates to a URL
        driver.get("https://www.google.com/");

        // 3. finds the element by name
        driver.findElement(By.name("q")).sendKeys("Testing");
        Thread.sleep(2000);
        // 4. closes the browser
        driver.close();
        // 5. quits the browser
        driver.quit();
    }
}
