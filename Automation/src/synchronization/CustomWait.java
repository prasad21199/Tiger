package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
public class CustomWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/ssandeep/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
	for(int i=0;i<1000;i++) {
		try {
			driver.findElement(By.xpath("(//a[@id='logoutLink'])[2]")).click();
			break;
		}catch (NoSuchElementException e) {
			System.out.println(i);
		}
	}
}
}
