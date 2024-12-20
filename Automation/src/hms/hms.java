package hms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hms {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://106.51.82.61:9007/");
		driver.manage().window().maximize();
		
		WebElement emialIdText = driver.findElement(By.xpath("//input[@id='email']"));
		emialIdText.sendKeys("puneeth@gmail.com");
		Thread.sleep(3000);
		System.out.println("emailid is entered into the text field");
		
		WebElement pwdText = driver.findElement(By.id("password"));
		pwdText.sendKeys("123456");
		System.out.println("pwd is entered into the text field");
		Thread.sleep(3000);
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		

	}

}
