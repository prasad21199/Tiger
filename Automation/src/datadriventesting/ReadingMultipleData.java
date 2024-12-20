package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;import net.bytebuddy.description.annotation.AnnotationDescription.Latent;
public class ReadingMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
//getLastRowNum() will get the last row index that is containing the data  in the sheet
	//The indexing will start from 0
	int lastRow = wb.getSheet("multipleData").getLastRowNum();
	System.out.println(lastRow);
	for(int i=0;i<=lastRow;i++) {//In order to read the data vertically
		String data = wb.getSheet("multipleData").getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);	}
//getLastCellNum() will return the count of cells having the data in the mentioned row
	//The count will start from 13+
	int lastCell = wb.getSheet("multipleData").getRow(0).getLastCellNum();
	System.out.println(lastCell);
	for(int i=0;i<lastCell;i++) {//In order to read the data horizontally
		String data = wb.getSheet("multipleData").getRow(0).getCell(i).getStringCellValue();
		System.out.println(data);	}
	int count = wb.getSheet("multipleData").getLastRowNum();
	for(int i=0;i<=count;i++) {//-->in order to iterate the rows
		int count1=wb.getSheet("multipleData").getRow(i).getLastCellNum();
		for(int j=0;j<count1;j++) {//In order to iterate the cells
			String data = wb.getSheet("multipleData").getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+ "  " );}
		System.out.println();}
}
}
