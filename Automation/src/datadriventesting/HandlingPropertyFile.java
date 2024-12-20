package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class HandlingPropertyFile {
public static void main(String[] args) throws IOException {
//We are converting high level data into stream of bytes and storing in FIS variable
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
//In order to retrieve the data from property file we create an object of Properties class
//In order to access non-static methods of Properties class we create an Object
	Properties p=new Properties();
//We are loading the binary data in to the Properties object using load(fis)
	p.load(fis);
//To retrieve the data we are using getProperty(String key) which will take the key has parameter
//and returns the value that has been associated along the key
	String url = p.getProperty("url");
	String un = p.getProperty("un");
	String pwd = p.getProperty("pwd");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
}
}
