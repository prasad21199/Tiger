package demoTest;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class DemoA {//Test Class
	@Test//Test Methods or test annotated methods
	public void demoA() {
		Reporter.log("Hello World");
		//Reporter.log("Hello World", false);
		//It will print only in the report 
	}
	@Test
	public void demoB() {
		Reporter.log("Welcome to Qspiders", true);
		//It will print both on report as well as console
	}
	@Test
	public void demoC() {
		System.out.println("Welcome to RCB");
		//It will print only on the console
	}
}