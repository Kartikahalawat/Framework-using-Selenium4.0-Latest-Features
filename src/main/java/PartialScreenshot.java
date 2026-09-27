import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class PartialScreenshot {
    static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://eventhub.rahulshettyacademy.com/login");
        WebElement element = driver.findElement(By.xpath("(//div[contains(@class, 'rounded-xl overflow-hidden')])"));

        File file = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("F://Study//Working Professional//SDET Journey//Selenium Web Driver Course Rahul Shetty Udemy//Codes//Selenium4.0//logo.png"));

        driver.quit();
    }
}
