package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.linkText("Web Table")).click();
		List<WebElement> allEle = driver.findElements(By.xpath("//th|//td"));
		int count = allEle.size();
		System.out.println(count);
		int size=0;
		for(int i=0;i<5;i++) {//-->Rows
			for(int j=0;j<5;j++) {//-->Columns
				WebElement ele = allEle.get(size);
				String text = ele.getText();
				System.out.print(text+"   ");
				size++;
			}
			System.out.println();
		}
	}
}
