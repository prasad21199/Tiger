package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class ListenerImplementation extends BaseClass implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+" has been passed",true);
	}@Override
	public void onTestFailure(ITestResult result) {
//getName() is used to fetch the name of the method that has been executed
//To take the screenshot in multiple names we use the name of the methods executed
	String res = result.getName();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/"+res+".png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
	}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	String res = result.getName();
	Reporter.log(res+" has been skipped",true);
	}
	@Override
	public void onTestStart(ITestResult result) {
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
