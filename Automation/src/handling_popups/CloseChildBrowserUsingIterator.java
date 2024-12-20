package handling_popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowserUsingIterator {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://secure.indeed.com");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Set<String> allWid = driver.getWindowHandles();
	String pwid = driver.getWindowHandle();
	Iterator<String> i = allWid.iterator();
	while(i.hasNext()) {
		String wid = i.next();
		driver.switchTo().window(wid);
		if(!wid.equals(pwid)) {
			driver.close();
			
		}
	
	}
}
}
