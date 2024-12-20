package demoTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class Activity extends BaseClass{
	@Test(invocationCount = 2)
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}@Test(priority = 1)
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
