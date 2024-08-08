package GenericPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility implements FrameworkConstant{
	public String ToReadDataFromExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
		
	}

}
