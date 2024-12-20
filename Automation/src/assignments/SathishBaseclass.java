package assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.DCOMPANY.pom.Homepage;
import com.DCOMPANY.pom.Login;

public class SathishBaseclass {
	public static Fileliberary fl;
	public static WebDriver driver;
	@BeforeTest
	public void openbrowser() throws IOException
	{
	driver=new ChromeDriver();
	fl = new Fileliberary();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	String url = fl.getpropertydata("url");
	driver.get(url);
	Reporter.log("openbrowser successs",true);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		String username = fl.getpropertydata("un");
		String password = fl.getpropertydata("pwd");
		Login l=new Login(driver);
		l.login(username, password);
		Reporter.log("login success",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Homepage h=new Homepage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
		h.getLogoutbtn().click();;
		Reporter.log("logout sucess",true);
	}
	@AfterTest
	public void closebrowser()
	{
		driver.manage().window().minimize();
		driver.quit();
		Reporter.log("logout",true);
	}

}
