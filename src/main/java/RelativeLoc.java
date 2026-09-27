import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLoc {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Scroll down
        Actions action = new Actions(driver);
        action.scrollByAmount(0, 100).perform();

        // 1. Find label above Name input
        WebElement nameEditBox =
                driver.findElement(By.cssSelector("[name='name']"));

        System.out.println(
                driver.findElement(
                        with(By.tagName("label")).above(nameEditBox)
                ).getText()
        );

        // 2. Find Date of Birth label
        WebElement dateOfBirth =
                driver.findElement(
                        By.xpath("//label[contains(text(),'Date of Birth')]")
                );

        // Find input below Date of Birth label
        WebElement dateOfBirthInput =
                driver.findElement(
                        with(By.tagName("input")).below(dateOfBirth)
                );

        // Interact with the input instead of getText()
        dateOfBirthInput.sendKeys("01/01/2000");

        // 3. Find checkbox using its label
        WebElement iceCreamLabel =
                driver.findElement(
                        By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]")
                );

        driver.findElement(
                with(By.tagName("input")).toLeftOf(iceCreamLabel)
        ).click();

        // 4. Find radio button label to the right
        WebElement rdb =
                driver.findElement(By.id("inlineRadio1"));

        System.out.println(
                driver.findElement(
                        with(By.tagName("label")).toRightOf(rdb)
                ).getText()
        );

        driver.quit();
    }
}
