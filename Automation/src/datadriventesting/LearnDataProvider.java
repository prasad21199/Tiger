package datadriventesting;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
public Object[][] getData() {
	Object[][]data= {{"admin","manager"},{"Dinga","Dingi"},{"Upendra","UI"}};
	return data;
}
}
