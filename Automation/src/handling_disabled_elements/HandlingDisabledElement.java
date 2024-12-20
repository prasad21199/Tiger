package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/Disabled.html");
		driver.findElement(By.id("t1")).sendKeys("Virat");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('t2').value='Anushka'");
	}
}