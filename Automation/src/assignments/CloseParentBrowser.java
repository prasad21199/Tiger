package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentBrowser {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	String pwid = driver.getWindowHandle();
	Set<String> allWid = driver.getWindowHandles();
	for(String Wid:allWid) {
		driver.switchTo().window(Wid);
		if(!pwid.equals(Wid)) {
			driver.close();
		}
	}
}
}
