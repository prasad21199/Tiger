package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class myntra {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement tab = driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
		Actions a= new Actions(driver);
		a.moveToElement(tab).perform();
		driver.findElement(By.linkText("Casual Shoes")).click();
		driver.findElement(By.xpath("(//h3[text()='HRX by Hrithik Roshan'])[1]/..//span[@class='product-discountedPrice']")).click();
		Set<String> tabs = driver.getWindowHandles();
		for(String e:tabs)
		{
			driver.switchTo().window(e);
		}
		driver.findElement(By.xpath("//p[text()='8']")).click();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		String text = driver.findElement(By.className("itemContainer-base-brand")).getText();
		String price = driver.findElement(By.xpath("//div[@class='itemContainer-base-brand']/../..//div[contains(text(),'887')]")).getText();
		System.out.println("the brand name ="+text);
		System.out.println("theprice of shoe="+price);
		driver.quit();
		
		
	

	}

}
