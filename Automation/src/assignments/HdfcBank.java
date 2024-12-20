package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HdfcBank {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.hdfcbank.com/");
	WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
	Actions a=new Actions(driver);
	a.moveToElement(login).perform();
	driver.findElement(By.linkText("NetBanking")).click();
	Set<String> allWid1 = driver.getWindowHandles();
	for (String wid : allWid1) {
		driver.switchTo().window(wid);	}
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
Set<String> allWid2 = driver.getWindowHandles();
String expectedTitle="Best";
for (String wid : allWid2) {
	driver.switchTo().window(wid);
String actualTitle = driver.getTitle();
if(actualTitle.contains(expectedTitle)) {break;}}
List<WebElement> allLAng = driver.findElements(By.xpath("//a[contains(@title,'Secure-Banking-Booklet')]"));
for ( WebElement ele : allLAng) {
String text = ele.getText();
System.out.println(text);}
}
}

