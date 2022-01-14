package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

		public static String getData(String a, int row, int cell) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("C:\\ddd\\Retestingsuite\\src\\main\\resources\\TestData.xlsx");
			String value = WorkbookFactory.create(file).getSheet(a).getRow(row).getCell(cell).getStringCellValue();
			return value;
		}
}
