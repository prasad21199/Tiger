package assignments;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CityNameIsPresent {
public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the city name");
		String cityName = scanner.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/Multi_select%20dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<WebElement> allOpts = s.getOptions();
		int count=0;
		for (WebElement ele : allOpts) {
			String text = ele.getText();
			if(cityName.equalsIgnoreCase(text)) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println(cityName+ " is present in the dropdown");
		}else {
			System.out.println(cityName+ " is not present in the dropdown");
		}
		driver.quit();
}
}
