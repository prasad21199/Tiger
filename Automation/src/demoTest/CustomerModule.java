package demoTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class CustomerModule {
	@Test(priority=0,invocationCount = 1)
	public void createCustomer() {
		Assert.fail();//Fail
		Reporter.log("createCustomer",true);
	}
	@Test(priority = 0, dependsOnMethods = "createCustomer")
	public void modifyCustomer() {//Skip 
		Reporter.log("modifyCustomer",true);
	}
	@Test()//If we not mention any priority it will consider the default value has '0'
	public void deleteCustomer() {//Pass
		Reporter.log("deleteCustomer",true);
	}
}
