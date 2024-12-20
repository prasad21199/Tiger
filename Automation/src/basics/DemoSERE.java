package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSERE {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/demo.html");
//@01 will be stored in the reference variable
		WebElement ele = driver.findElement(By.tagName("a"));
//		The address of the element will be changed to @02 if page is refreshed or reloaded
//		driver.navigate().refresh();
//		ele.click();
		driver.navigate().back();
		//It will throw SERE since we try to click on the element with the help of old address
		ele.click();
	}
}
