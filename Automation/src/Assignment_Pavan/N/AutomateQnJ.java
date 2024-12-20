package Assignment_Pavan.N;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateQnJ {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().setPosition(new Point(400,655));
		driver.manage().window().setSize(new Dimension(500,583));
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.get("https://www.qspiders.com/");
		driver.navigate().to("https://jspiders.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String source = driver.getPageSource();
//		System.out.println(source);
		String J_title = driver.getTitle();
		String J_CurrentTitle = driver.getCurrentUrl();
		System.out.println(J_title);
		System.out.println(J_CurrentTitle);
		String expected_title = "Java training Institute | JSpiders";
		String actual_title = "https://jspiders.com/";
		if(J_title.equalsIgnoreCase(expected_title)&& J_CurrentTitle.equalsIgnoreCase(actual_title)) {
			System.out.println("Java Training Institute | JSpiders ");
		}
		else
			System.out.println("Doesn't Match ");
		
		driver.manage().window().minimize();
		driver.quit();
		}
	
}
