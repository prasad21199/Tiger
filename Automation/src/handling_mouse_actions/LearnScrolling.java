package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LearnScrolling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bbc.com/");
	WebElement travel = driver.findElement(By.xpath("//h2[text()='Travel']"));
	Actions a=new Actions(driver);Thread.sleep(2000);
	//scrollToElement(WebEle ele) is used to scroll until the particular element is visible
	a.scrollToElement(travel).perform();
	//scrollByAmount(int x,int y) is used to scroll until the mentioned pixel values 
	a.scrollByAmount(0, 5000).perform();
}
}
