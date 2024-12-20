package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Web Elements']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();Thread.sleep(2000);
	driver.findElement(By.linkText("Drag Position")).click();
	List<WebElement> draggables = driver.findElements(By.className("draggable"));
	WebElement mobileDrop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
	WebElement laptopDrop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
	Actions a=new Actions(driver);
	for(int i=0;i<draggables.size();i++) {
		WebElement drag = draggables.get(i);
		String text = drag.getText();
	if(text.contains("Mobile")) {
		a.dragAndDrop(drag, mobileDrop).perform();
	}else if(text.contains("Laptop")){
		a.dragAndDrop(drag, laptopDrop).perform();
	}
	}
}
}
