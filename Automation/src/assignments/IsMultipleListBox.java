package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleListBox {

		public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("file:///C:/Users/QSP/Desktop/Multi_select%20dropdown.html");
	WebElement dd= d.findElement(By.id("lang"));
	Select s = new Select(dd);
	boolean res =s.isMultiple();
	if(res==true)
	{
		System.out.println("the dropdown is multi-select");
		}
	else
	{
		System.out.println("the dropdown is single-select");
		}
	d.quit();
		}

	}

