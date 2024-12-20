package learn_webelement_methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAtt {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement button = driver.findElement(By.name("login"));
//getTagName() is used to get the taganame
	String tagName = button.getTagName();
//getText() is used to fetch the tag text of an element. 
//If there is no tag text it will print empty space
	String tagText =button.getText();
//getAttribute(String attName) is used to get the respective attribute value
//If there is no att Name it will return null
	String value =button.getAttribute("data-testid");
//getCssValue(String ProName) is used to get the respective property value
//If there is no property Name it will return null
	String color = button.getCssValue("background-color");
	System.out.println("The tagname of the element: "+tagName);
	System.out.println("The tagtext of the element: "+tagText);
	System.out.println("The Attribute value of the element: "+value);
	System.out.println("The css value of the element: "+color);
	driver.quit();
}
}
