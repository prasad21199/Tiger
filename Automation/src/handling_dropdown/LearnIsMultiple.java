package handling_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnIsMultiple {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/Multi_select%20dropdown.html");
//		WebElement dd = driver.findElement(By.id("city"));
		WebElement dd = driver.findElement(By.id("lang"));
		Select s=new Select(dd);
//isMultiple() is used to check whether the dropDown is multi-select or not		
		boolean res = s.isMultiple();
		if(res==true) {
			System.out.println("The dropdown is multi-select");
		}else {
			System.out.println("The dropdown is single-select");
		}
//getWrappedElement() is used to wrap all the options present in the listbox and convert into single element
        WebElement ele = s.getWrappedElement();
        System.out.println(ele.getText());
		driver.quit();
	}
}
