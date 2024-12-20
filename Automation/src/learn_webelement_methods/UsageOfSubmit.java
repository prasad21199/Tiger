package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//	driver.get("https://fb.com");
		//	driver.findElement(By.name("login")).submit();
		driver.get("https://www.instagram.com/");Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).submit();
	}
}