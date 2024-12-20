package Assignment_Pavan.N;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("Apple iphone14 pro max");
		ele.submit();

	}

}
