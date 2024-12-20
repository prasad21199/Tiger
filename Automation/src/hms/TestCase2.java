package hms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //open chrome browser
		driver.get("http://106.51.82.61:9007/"); // enter url
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		//identify un tf and enter un
		WebElement emailtf = driver.findElement(By.id("email"));
		emailtf.sendKeys("rogesh@gmail.com");

		//identify pwd tf and enter pwd
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rogesh@123");
		Thread.sleep(2000);

		//identify login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("patient logged in");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[@class='fa fa-edit']")).click();
		System.out.println("clicked on appoinment button");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Appointment List']")).click();
		System.out.println("appoinment page is displayed");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Apply For Appointment')]")).click();
		System.out.println("app selection page is dispalyed");
		Thread.sleep(2000);


		driver.findElement(By.id("s2id_autogen3")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("arjun reddy");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[text()='Arjun Reddy'])[last()]")).click();
		System.out.println("dr selected");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='date_timestamp']")).sendKeys("Fri, 13 December 2024");
		//driver.findElement(By.xpath("//td[@class='active day']")).click();
		   Thread.sleep(3000);
		   
		   driver.findElement(By.name("time_timestamp")).clear();
		   driver.findElement(By.name("time_timestamp")).sendKeys("01:30");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.className("modal-title")).click();

		   driver.findElement(By.xpath("//input[@type='submit']")).click();
		   
		   System.out.println("app is applied");
		   
		   driver.findElement(By.xpath("//a[contains(text(),'Log Out ')]")).click();
		   System.out.println("logged out as pat");
		   
		   //login as dr
		   driver.findElement(By.id("email")).sendKeys("arjun@gmail.com");
		   Thread.sleep(1500);
		   
		   driver.findElement(By.id("password")).sendKeys("arjn");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		   System.out.println("logged in as DR");


		Thread.sleep(10000);
		//driver.quit();

	}

}
