package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/Multi_select%20dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	s.selectByIndex(0);Thread.sleep(2000);
	s.selectByValue("m");Thread.sleep(2000);
	s.selectByVisibleText("Mysuru");Thread.sleep(2000);
	s.deselectByIndex(2);Thread.sleep(2000);
	s.deselectByVisibleText("Mangaluru");Thread.sleep(2000);
	s.deselectByValue("b");
	s.deselectAll();
}
}
