package learn_webelement_methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/");Thread.sleep(2000);
	driver.findElement(By.id("renew_nav")).click();Thread.sleep(2000);
	Set<String> allWid = driver.getWindowHandles();
	for (String wid : allWid) {
		driver.switchTo().window(wid);
	}Thread.sleep(2000);
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();Thread.sleep(2000);
	WebElement month = driver.findElement(By.className("ui-datepicker-month"));Thread.sleep(2000);
	Select s1=new Select(month);
	s1.selectByIndex(6);
	WebElement year = driver.findElement(By.className("ui-datepicker-year"));
	Select s2=new Select(year);Thread.sleep(2000);
	s2.selectByVisibleText("1981");
	driver.findElement(By.linkText("7")).click();Thread.sleep(2000);
	driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
	driver.findElement(By.id("renew_policy_submit")).click();Thread.sleep(2000);
	WebElement errorMsg = driver.findElement(By.id("policynumberError"));
	boolean res = errorMsg.isDisplayed();
	if(res) {
		String text = errorMsg.getText();
		System.out.println(text+" is displayed");
	}else {
		System.out.println("error message is not displayed");
	}
	driver.quit();
}
}
