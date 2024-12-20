package learn_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoA {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/DemoA.html"); 
//		WebElement ele = driver.findElement(By.tagName("a"));
//		ele.click(); 
//		driver.navigate().back(); 
//		WebElement ele1 = driver.findElement(By.id("d2"));
//		ele1.click(); 
//		driver.navigate().back(); 
//		WebElement ele2 = driver.findElement(By.name("n1")); 
//		ele2.click(); 
//		driver.navigate().back(); 
//		driver.findElement(By.className("c 2")).click();
//		driver.findElement(By.linkText("Qspiders")).click();
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("jsp")).click();
	}
}
