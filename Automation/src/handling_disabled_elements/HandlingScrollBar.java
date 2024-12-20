package handling_disabled_elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;Thread.sleep(2000);
//It will scroll to 3000 pixels from initial position
	jse.executeScript("window.scrollTo(0,3000)");Thread.sleep(2000);
//It will scroll for 2000 pixels from current position of the scrollbar(3000 pixels)
	jse.executeScript("window.scrollBy(0,2000)");
	}
}
