package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(groups = {"SmokeTest","RegressionTest"})
	public void createCustomer() {
		Assert.fail();
		Reporter.log("createCustomer",true);
	}
	@Test(groups = "RegressionTest",dependsOnMethods = "createCustomer")
	public void modifyCustomer() throws InterruptedException {
		Reporter.log("modifyCustomer",true);
	}
	@Test(groups = "RegressionTest")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}