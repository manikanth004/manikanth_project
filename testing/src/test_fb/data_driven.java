package test_fb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.dev.XSSFSave;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data_driven
{

	public static void main(String[] args) throws IOException
	{
		String filepath="testdata\\Book1.xlsx";
		FileInputStream fi=new FileInputStream(filepath);
		
		
		
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		XSSFSheet sheet=book.getSheet("sheet1");
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell sell=row.getCell(0);
		
		//String name=sell.getStringCellValue();
		//System.out.println(name);
		
		Double numerical_value=sell.getNumericCellValue();
		System.out.println(numerical_value);
		
		int nwumericin_intvalue=numerical_value.intValue();
		System.out.println(nwumericin_intvalue);
		
		
		

	}

}
