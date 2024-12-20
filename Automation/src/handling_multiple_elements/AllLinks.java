package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	List<WebElement> allEle = driver.findElements(By.tagName("a"));
	int count = allEle.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
//In order to access one element from List we use get(int i),
//the returntype of get() will be the collection type
		WebElement ele = allEle.get(i);
		String text = ele.getText();
		System.out.println(text);
	}
	driver.quit();
}
}
