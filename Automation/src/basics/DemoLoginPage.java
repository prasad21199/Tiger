package basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class DemoLoginPage {
	@FindBy(id="username")
	WebElement unTbx;
	@FindBy(name="pwd")
	private WebElement pwdTbx;				//Declaration
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;
	
	public void login(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);					 //Utilization
		loginBtn.click();
	}
}