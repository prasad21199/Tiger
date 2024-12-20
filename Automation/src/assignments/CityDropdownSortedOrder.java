package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CityDropdownSortedOrder
{

	public static void main(String[] args) 
	{
		//To sort dropdown options in ascending order
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/HP/Desktop/Webpage.html"); 
		
	       WebElement city=driver.findElement(By.id("city"));
	       
	       Select s=new Select(city);
	       
	       List<String> al = new ArrayList<>();
	       List<WebElement> allOpt=s.getOptions();
	       
	       for(int i=0;i<allOpt.size();i++)
	       {
	    	   WebElement ele = allOpt.get(i);
	    	   String text=ele.getText();
	    	   al.add(text);
	       }
	       Collections.sort(al);
	       for(String text:al)
	       {
	    	   System.out.println(text);
	       }
	       driver.quit();
	}

}
