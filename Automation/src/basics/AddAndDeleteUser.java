package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAndDeleteUser {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.linkText("USERS")).click();
	driver.findElement(By.className("buttonText")).click();
	WebElement popup = driver.findElement(By.id("userDataLightBox"));
	boolean res = popup.isDisplayed();
	if(res==true) {
		System.out.println("The add user popup is displayed");
	}else {
		System.out.println("The add user popup is not displayed");
	}
	driver.findElement(By.name("firstName")).sendKeys("Virat");
	driver.findElement(By.name("lastName")).sendKeys("Kohli");

	
	driver.findElement(By.name("email")).sendKeys("Virat@18");
	driver.findElement(By.name("username")).sendKeys("VIRAT");
	driver.findElement(By.name("password")).sendKeys("Anushka");
	driver.findElement(By.name("passwordCopy")).sendKeys("Anushka");
	driver.findElement(By.xpath("//div[contains(text(),'Hire Date:')]/..//button")).click();Thread.sleep(2000);
	driver.findElement(By.className("x-date-middle")).click();Thread.sleep(2000);
	driver.findElement(By.linkText("Nov")).click();Thread.sleep(2000);
	driver.findElement(By.linkText("2021")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(text(),'OK')])[2]")).click();Thread.sleep(2000);
	driver.findElement(By.linkText("5")).click();Thread.sleep(2000);
	driver.findElement(By.id("userDataLightBox_commitBtn")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@class,'filterFieldInput')]")).sendKeys("Virat");
	WebElement createdUser = driver.findElement(By.className("highlightToken"));
	String userName = createdUser.getText();
	boolean res1 = createdUser.isDisplayed();
	if(res1==true) {
		System.out.println(userName+" is created");
	}else {
		System.out.println(userName+" is not created");
	}
	createdUser.click();Thread.sleep(2000);
	WebElement popup2 = driver.findElement(By.id("userDataLightBox"));
	boolean res2 = popup2.isDisplayed();
	if(res2==true) {
		System.out.println("The delete user popup is displayed");
	}else {
		System.out.println("The delete user popup is not displayed");
	}
	driver.findElement(By.id("userDataLightBox_deleteBtn")).click();Thread.sleep(2000);
	driver.switchTo().alert().accept();Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@class,'filterFieldInput')]")).sendKeys("Virat");
	Thread.sleep(2000);
	boolean res3 = driver.findElement(By.id("noUsersToShowId")).isDisplayed();
	if(res3==true) {
		System.out.println("There are no users found");
	}else {
		System.out.println("User is found");
	}
	driver.findElement(By.id("logoutLink")).click();
	driver.manage().window().minimize();
	driver.quit();
}
}
