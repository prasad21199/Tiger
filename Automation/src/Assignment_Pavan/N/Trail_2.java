package Assignment_Pavan.N;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trail_2 {
	public static void main(String[] args) {
//	WebDriver driver = new FirefoxDriver();
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.findElement(By.tagName("q")).sendKeys("");
	driver.findElement(By.tagName("q")).submit();
	System.out.println();
	driver.quit();
	}
}
