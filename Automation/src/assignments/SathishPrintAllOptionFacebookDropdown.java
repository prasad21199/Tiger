package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SathishPrintAllOptionFacebookDropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);//new Select(WebElement element)
		List<WebElement> options = s.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
