package handling_dropdown;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectAndDeselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/Multi_select%20dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<WebElement> allEle = s.getOptions();
		int count = allEle.size();
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);		//Select the options in ascending order
		}
		for(int i=count-1;i>=0;i--) {
			s.deselectByIndex(i);	//Deselect all the options in descending order
		}
		for (WebElement ele : allEle) {
			String text = ele.getText();
			s.selectByVisibleText(text);//Select the options using selectByVisibleText()
		}
		for (WebElement ele : allEle) {
			String value = ele.getAttribute("value");
			s.deselectByValue(value);//Deselect the options using deselectByValue()
		}
	}
}
