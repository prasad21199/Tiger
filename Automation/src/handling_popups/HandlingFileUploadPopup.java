package handling_popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingFileUploadPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/Naukri.html");
		File f=new File("./data/Resume.doc");
		String abspath = f.getAbsolutePath();
		driver.findElement(By.id("uploadButton")).sendKeys(abspath);
	}
}