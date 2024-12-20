package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollToElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.selenium.dev/downloads/");
	WebElement ele = driver.findElement(By.xpath("//h2[text()='Source Code']"));
	Point p = ele.getLocation();
	int yAxis = p.getY();
	JavascriptExecutor js=(JavascriptExecutor) driver;
//executeScript() will perform scrolling until the element is present in the top of the webpage
	js.executeScript("window.scrollTo(0,"+yAxis+")");
	Actions a=new Actions(driver);
//scrollToElement(WebEle ele) will perform scrolling until the element is displayed in the webpage
	a.scrollToElement(ele).perform();
}
}
