package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//We are converting data from human understandable language to machine understandable
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//In order to read the data from excel file we need to create an object of Workbook interface
//using WorkbookFactory.create(fis) which will create the object and load the data to the object
		Workbook wb = WorkbookFactory.create(fis);
//From the excel object first we need to fetch the sheet from which we read the data by using
//getSheet(String sheetName) and then we need to fetch the row by using getRow(int index) and 
//get the cell from the row using getCell(int index) to get the data from cell we use
//getStringCellValue() or toString(), to get numeric data we use getNumericCellValue()		
		String data = wb.getSheet("createCustomer").getRow(1).getCell(5).getStringCellValue();
		System.out.println(data);
	}
}
