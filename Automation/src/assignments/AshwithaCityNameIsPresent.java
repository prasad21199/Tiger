package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AshwithaCityNameIsPresent {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city");
		String cityName=sc.nextLine();
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/HP/Desktop/Webpage.html"); 
	    WebElement city=driver.findElement(By.id("city"));
	    Select s=new Select(city);
	    List<WebElement> allOpts = s.getOptions();
	    int count=0;
	    for(WebElement ele:allOpts)
	    {
	    	String text=ele.getText();
	    	if(cityName.equalsIgnoreCase(text))
	    	{
	    		count++;
	    		break;
	    	}
	    }
	    if(count==1)
	    {
	    	System.out.println("The city name is present in the dropdown");
	    }
	    else
	    {
	    	System.out.println("The city name is not present in the dropdown");
	    }
        driver.quit();
	}

}
