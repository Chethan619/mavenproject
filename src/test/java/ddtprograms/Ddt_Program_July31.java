package ddtprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddt_Program_July31 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
    {
    	
		FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProjectM\\DDT\\chethanreddy.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String email=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		System.out.println(email);
		String pass=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(pass);
    }
}
