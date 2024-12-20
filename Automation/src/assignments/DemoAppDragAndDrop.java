package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click(); //clicking on the web element
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click(); // clicking on the mouse actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Drag Position")).click();
		Thread.sleep(2000);
		
		
		List<WebElement> allDrag = driver.findElements(By.xpath("//div[@draggable='true']")); // finding all the draggables
		
		WebElement mobileDroppable = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/..")); // finding the droppable
		WebElement lapptopDroppable = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));// finding the droppable

		Actions a = new Actions(driver);
		
		for (WebElement dragElement : allDrag) {  // dragging and dropping to the relevant section...mobile to mobile and lappy to lappy
			if (dragElement.getText().contains("Mobile")) {
				Thread.sleep(2000);
				a.dragAndDrop(dragElement, mobileDroppable).perform();
			}
			else {
				Thread.sleep(2000);
				a.dragAndDrop(dragElement, lapptopDroppable).perform();
			}
		}
		driver.quit();
	}
}
