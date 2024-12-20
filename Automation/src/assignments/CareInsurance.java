package assignments;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CareInsurance {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(1000);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
		Thread.sleep(1000);
		WebElement monthListbox= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(monthListbox);
	//List<WebElement> AllOption= s1.getOptions();
		s1.selectByIndex(0);
		Thread.sleep(1000);
		WebElement dateListbox= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(dateListbox);
		s2.selectByValue("1991");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		Thread.sleep(1000);
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.id("policynumberError")).getText();
		Thread.sleep(1000);
		if(text.contains("Please enter valid Policy No"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		System.out.println("care insurance");
	driver.quit();
	
	}

}
