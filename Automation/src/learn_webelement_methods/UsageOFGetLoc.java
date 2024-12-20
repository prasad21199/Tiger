package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOFGetLoc {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement firstname = driver.findElement(By.name("firstname"));
	WebElement lastname = driver.findElement(By.name("lastname"));
//getSize() is used to get the size of the element
	Dimension d1 = firstname.getSize();
//From Dimension to get height and width separately we use getHeight() & getWidth()
	int h1 = d1.getHeight();				int w1 = d1.getWidth();
	int h2 = lastname.getSize().getHeight();	int w2 = lastname.getSize().getWidth();
//getLocation() is used to get the location of the element
	Point p1 = firstname.getLocation();
//getRect() is used to get the size and location of an element.It is combination of getSize &getLoc
//	Rectangle r1 = firstname.getRect();
//	int xAxis1 = p1.getX();
//From Point to get x Axis and y Axis separately we use getX() & getY()
	int yAxis1 = p1.getY();
    int yAxis2 = lastname.getLocation().getY();
	if(h1==h2&&w1==w2&&yAxis1==yAxis2) {
		System.out.println("Pass: Both the textbox are of same size and alligned properly");
	}else {
System.out.println("Fail: Both the textbox are of different size and not alligned properly");
	}
	driver.quit();
}
}
