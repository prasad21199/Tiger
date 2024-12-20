package handling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnGetOptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Multi_select%20dropdown.html");
	WebElement lang = driver.findElement(By.id("lang"));
	Select s=new Select(lang);
//getFirstSelectedOption() is used get the first selected option in the listbox
//If none of the options are selected it will throw NSEE
	WebElement ele = s.getFirstSelectedOption();
	System.out.println(ele.getText());
//getAllSelectedOptions() is used get all the selected options in the listbox
//If none of the options are selected it will return Empty List
	List<WebElement> allSelEle = s.getAllSelectedOptions();
	for(int i=0;i<allSelEle.size();i++) {
		WebElement element = allSelEle.get(i);
		String text = element.getText();
		System.out.println(text);
	}
//getOptions() is used to get all the options present in the listbox
	List<WebElement> allEle = s.getOptions();
	for(WebElement ele1:allEle) {
		System.out.println(ele1.getText());
	}
}
}
