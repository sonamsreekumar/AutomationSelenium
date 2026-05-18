package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f; //inBuild class used to input an excel file
	static XSSFWorkbook w; // inBuild Used to inPut and excel workbook
	static XSSFSheet s; // inBuild class used to input an excel sheet
	
	public static String getStringData(int a , int b, String sheet) throws IOException
	{
		f = new FileInputStream ("C:\\Users\\MANU SANKAR\\git\\AutomationSelenium\\GroceryApplication\\src\\test\\resources\\TestData.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}
	public static int getIntegerData(int a, int b, String sheet) throws IOException
	{
		f = new FileInputStream ("C:\\Users\\MANU SANKAR\\git\\AutomationSelenium\\GroceryApplication\\src\\test\\resources\\TestData.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		//typecasting - conversion of one datatype to another
		int x = (int) c.getNumericCellValue();
		return x;	
	}
}