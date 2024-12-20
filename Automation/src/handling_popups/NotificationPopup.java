package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications","-incognito","--start-maximized");
//	opt.addArguments("--disable-notifications");-->Used to disable the notifications
//	opt.addArguments("-incognito");-->Used to launch browser in incognito mode
//	opt.addArguments("--start-maximized");-->Will launch browser in maximized mode
	WebDriver driver=new ChromeDriver(opt);Thread.sleep(2000);
//	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
}
}
