package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAUtomationFrames {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	WebElement frameEle = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	//This will transfer the control to the first frame where we cannot use index since it is having 42 frames
	driver.switchTo().frame(frameEle);
//This will transfer the control to the child frame using index since there is only one nested frame in parent frame
	driver.switchTo().frame(0);
	driver.findElement(By.tagName("input")).sendKeys("ESCN");
	
}
}
