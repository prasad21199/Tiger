package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opensourcebilling.org/en/users/sign_in#");
//clear() is used to clear the existing the text present in the textfield
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("password")).clear();
}
}
