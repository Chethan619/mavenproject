package utility_project1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT 
{
	public static String email;
	public static String pass;
    public void credentials() throws EncryptedDocumentException, IOException
    {
    	FileInputStream f1=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProjectM\\DDT\\chethanreddy.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		email=w1.getSheet("loginamazon").getRow(0).getCell(0).getStringCellValue();
		pass=w1.getSheet("loginamazon").getRow(0).getCell(1).getStringCellValue();
    }
}
