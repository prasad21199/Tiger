package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allautosuggestions {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		List<WebElement>allsugg=driver.findElements(By.xpath("//span[contains(text(),'java')"));
		int count=allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(0).click();
		}
	}

