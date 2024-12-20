package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSingleFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/T1.html");Thread.sleep(2000);
	driver.findElement(By.id("t1")).sendKeys("Virat");
	driver.switchTo().frame(0);Thread.sleep(2000);
	driver.findElement(By.id("t2")).sendKeys("Rohith");
	driver.switchTo().parentFrame();Thread.sleep(2000);
	driver.findElement(By.id("t1")).sendKeys("Kohli");
	driver.switchTo().frame("f1");Thread.sleep(2000);
	driver.findElement(By.id("t2")).sendKeys("Sharma");
}
}










