package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class WriteDataIntoExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
//setCellValue(String value) will set the data in the cell in low level
//In order to convert it into high level we create Object of FileOutputStream
		wb.getSheet("createCustomer").getRow(1).getCell(5).setCellValue("Darshan@devil.com");
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
//In order to write the high level data into excel we use write(FOS) of Workbook interface
		wb.write(fos);
	}
}