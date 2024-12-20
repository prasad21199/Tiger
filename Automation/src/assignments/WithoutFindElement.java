package assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutFindElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
//activeElement() is use to transfer the control to the active element present in the webpage
//We can transfer the control only for the active element(only one element)
	WebElement ele = driver.switchTo().activeElement();
	ele.sendKeys("Tyson vs jake"+Keys.ENTER);
}
}
