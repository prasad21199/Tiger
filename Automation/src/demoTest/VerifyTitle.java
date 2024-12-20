package demoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
String actualTitle = driver.getTitle();
String expectedTitle="Googly";
//if(actualTitle.equals(expectedTitle)) {
//	Reporter.log("Pass",true);
//}else {
//	Reporter.log("Fail",true);
//}
//Assert.assertEquals(actualTitle, expectedTitle);
SoftAssert s=new SoftAssert();
s.assertEquals(actualTitle, expectedTitle);
driver.quit();
s.assertAll();
	}
}
