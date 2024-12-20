package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class MyntraAddToCart {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com");Thread.sleep(2000);
	WebElement kids = driver.findElement(By.xpath("//a[@class='desktop-main' and text()='Kids']"));
	Actions a=new Actions(driver);
	a.moveToElement(kids).perform();Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/school-shoes?plaEnabled=false']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("(//h3[@class='product-brand']/../..)[1]")).click();Thread.sleep(2000);
	Set<String> allWid = driver.getWindowHandles();
	for (String wid : allWid) {
		driver.switchTo().window(wid);	}
	driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and text()='9']")).click();
	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();Thread.sleep(2000);
	driver.findElement(By.linkText("GO TO BAG")).click();Thread.sleep(2000);
	WebElement addedItem = driver.findElement(By.className("itemContainer-base-brand"));
	boolean res = addedItem.isDisplayed();			String text = addedItem.getText();
	if(res) {
		System.out.println(text+" is added to the cart");
	}else {
		System.out.println(text+" is not added to the cart");
	}
}
}
