package basics;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnCrossBrowserTesting {
	public static WebDriver driver;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser = s.nextLine();
		switch(browser) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default: driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
