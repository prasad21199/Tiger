package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		 driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager"); driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.titleContains("Enter"));
		String title= driver.getTitle(); 
		System.out.println(title);
		driver.close();
		}}


