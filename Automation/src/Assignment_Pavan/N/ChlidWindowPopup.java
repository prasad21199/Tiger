package Assignment_Pavan.N;

	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ChlidWindowPopup {
		public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://secure.indeed.com");
	      driver.findElement(By.id("login-google-button")).click();
	      String pwid = driver.getWindowHandle();
	      Set<String> allwid = driver.getWindowHandles();
	     for(String e:allwid)
	     {
	    	 driver.switchTo().window(e);
	    	 System.out.println(driver.getTitle());
	    	 driver.close();
	     }
}
	}
