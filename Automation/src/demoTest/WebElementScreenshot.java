package demoTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class WebElementScreenshot {
	@Test
public void demo() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.royalchallengers.com/");
	WebElement logo = driver.findElement(By.className("hdr-logo"));
	//Since WebElement is inheriting TakesScreenshot no need of typecasting the method will be accessible directly
	File src = logo.getScreenshotAs(OutputType.FILE);
	File dest=new File("./errorshots/logo.png");
	FileUtils.copyFile(src, dest);
	driver.quit();
}
}
