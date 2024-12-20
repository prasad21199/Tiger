package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Syc1 {
	
	public static void main(String[] args) {
		ChromeOptions otp=new ChromeOptions();
		otp.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(otp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hdfcbank.com/");
		WebElement loginbtn = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(loginbtn).perform();
		driver.findElement(By.xpath("//a[text()='NetBanking']")).click();
		Set<String> allwin = driver.getWindowHandles();
		for (String wid : allwin) {
			driver.switchTo().window(wid);
		}
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
		Set<String> allwin1 = driver.getWindowHandles();
		Iterator<String> itr1 = allwin1.iterator();
		for (String win1 : allwin1) {
			driver.switchTo().window(win1);
		}
		List<WebElement> allLang = driver.findElements(By.xpath("//p[contains(text(),'Download the Secure Banking Guide in your preferred language:')]"));
		for (WebElement lang : allLang) {
			String text = lang.getText();
			System.out.println(text);
			
		}
		driver.quit();
	}

}



