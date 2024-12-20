package assignments;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RaghuAssignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String Pageurl = driver.getCurrentUrl();
		String Pagename = driver.getTitle();
		
		String Actualurl = "https://www.google.com/";
		String Actualname = "Google";
		
		if(Actualurl.equals(Pageurl)&&Actualname.equals(Pagename)) {
			System.out.println("We have opened the correct webpage");
		}
		else {
			System.out.println("We have opened the wrong webpage");
		}
		
		driver.quit();
	}
}
