package locators.basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
    public static void main(String[] args) {
        // 1. starts the chorme browser session
        WebDriver driver = new ChromeDriver();
        // maximizes the browser window
        driver.manage().window().maximize();
        // 2. navigates to a URL
        driver.get("https://www.booking.com");

        // 3. finds the element by id
        driver.findElement(By.id("flights")).click();

        // 4. closes the browser
        driver.close();
        // 5. quits the browser
        driver.quit();
    }
}
