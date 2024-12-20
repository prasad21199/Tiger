package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
	driver.get("https://www.instagram.com");
//isEnabled() is used to check whether we can perform action on the element or not
	boolean res = driver.findElement(By.xpath("//button[.='Log in']")).isEnabled();
//	boolean res = driver.findElement(By.name("login")).isEnabled();
	if(res) {
		System.out.println("The login button is enabled");
	}else {
		System.out.println("The login button is disabled");
	}
	 driver.quit();
}
}
