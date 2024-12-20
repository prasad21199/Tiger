package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferDirectlyToTheChild {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
	driver.findElement(By.id("browserButton2")).click();
	Set<String> allWidInSet = driver.getWindowHandles();
	List<String> al=new ArrayList<>(allWidInSet);
	String wid3 = al.get(3);
	driver.switchTo().window(wid3);Thread.sleep(2000);
	driver.close();
}
}
