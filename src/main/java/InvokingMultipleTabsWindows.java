import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class InvokingMultipleTabsWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open parent page
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Open child tab
        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();

        String parentWind = it.next();
        String childWind = it.next();

        // Switch to child tab & navigate
        driver.switchTo().window(childWind);
        driver.get("https://rahulshettyacademy.com/practice");

        // OPTION 1: Grab text from the first card header using standard relative path
        WebElement firstCourseHeader = driver.findElement(
                By.xpath("(//div[contains(@class, 'rounded-lg')]//h3)[1]")
        );
        String courseName = firstCourseHeader.getText();

        // Fallback: If courseName is still empty, grab the description text from the paragraph instead
        if (courseName.isEmpty()) {
            courseName = driver.findElement(
                    By.xpath("(//div[contains(@class, 'rounded-lg')]//p)[1]")
            ).getText();
        }

        System.out.println("Captured Course Text: " + courseName);

        // Switch back to parent tab & enter text into the Name field
        driver.switchTo().window(parentWind);

        // Target the Name field specifically using name="name" or class
        WebElement nameInput = driver.findElement(By.cssSelector("input[name='name']"));
        nameInput.sendKeys(courseName);

        Thread.sleep(4000);

        driver.quit();
    }
}