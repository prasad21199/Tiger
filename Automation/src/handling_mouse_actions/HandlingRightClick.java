package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingRightClick {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.linkText("Sign Up"));
	Actions a=new Actions(driver);Thread.sleep(2000);
	a.contextClick(ele).perform();
	Robot r=new Robot();
//	r.keyPress(KeyEvent.VK_T);//It will open the link in a new tab
	r.keyPress(KeyEvent.VK_W);//It will open the link in new window
}
}
