package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToActitime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://online.actitime.com/ssandeep");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	wait.until(ExpectedConditions.titleContains("Enter Time"));
	String title = driver.getTitle();
	System.out.println(title);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@id='logoutLink'])[2]")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='logoutLink'])[2]")));
	driver.findElement(By.xpath("(//a[@id='logoutLink'])[2]")).click();
}
}
