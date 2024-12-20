package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asb {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Java");
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = autosuggestion.size();
		System.out.println(count);
		for(WebElement sugg:autosuggestion) {
			System.out.println(sugg.getText());
			
		}
		autosuggestion.get(1).click();
		
		driver.quit();
		
	}

}
