package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AllOptionsInListbox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.fb.com");
	driver.findElement(By.linkText("Create new account")).click();
	
	WebElement untbx = driver.findElement(By.id("username"));
	untbx.sendKeys("admin");
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	List<WebElement> allOpt = s.getOptions();
	for(int i=0;i<allOpt.size();i++) {
		WebElement ele = allOpt.get(i);
		String text = ele.getText();
		System.out.println(text);
	}
	driver.quit();
}
}
