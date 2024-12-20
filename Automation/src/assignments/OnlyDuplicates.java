package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class OnlyDuplicates {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/QSP/Desktop/Multi_select%20dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Set<String>ts=new TreeSet<>();
		Select s=new Select(city);
		List<WebElement> allOpts = s.getOptions();
		for(int i=0;i<allOpts.size();i++) {
			String text = allOpts.get(i).getText();
			boolean res = ts.add(text);//add(String) will return false if the option is already present in set
			if(res==false) {
				System.out.println(text);
			}
		}
		driver.quit();
	}
}
