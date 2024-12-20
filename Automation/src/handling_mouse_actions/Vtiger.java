package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Vtiger {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.vtiger.com/");
	WebElement company = driver.findElement(By.linkText("Company"));
	Actions a=new Actions(driver);
	a.moveToElement(company).perform();
//Whenever we perform mouse hover it will display a dropdown menu
	driver.findElement(By.linkText("Contact Us")).click();
String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
System.out.println(text);
driver.quit();

}
}
