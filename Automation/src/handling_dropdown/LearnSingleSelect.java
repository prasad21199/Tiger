package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);Thread.sleep(2000);
//selectByIndex(int index) is used to select an option based on the specified index starting from 0 
	s.selectByIndex(5);Thread.sleep(2000);
//selectByValue(String value) is used to select option based on specified value present in the 
//option tag of the required element
	s.selectByValue("2");Thread.sleep(2000);
//selectByVisibleText(String text) is used to select the option based on the tagtext of option tag
	s.selectByVisibleText("Dec");
//	s.deselectByIndex(5);//We cannot deselect single select dropdowns
	
}
}
