package test_fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException
	{

		File file=new File("testdata\\Book1.xlsx");
		System.out.println("file located");
		
		FileInputStream fi=new FileInputStream(file);
		System.out.println("file located with input stream");
		
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("workboook found");
		
		XSSFSheet sht=book.getSheet("Sheet1");
		
		XSSFRow row=sht.getRow(1);
		
		XSSFCell cell=row.getCell(0);
		Double numer_doub=cell.getNumericCellValue();
		Long numer_long=numer_doub.longValue();
		String mobile_no=NumberToTextConverter.toText(numer_long);
		System.out.println(mobile_no);
		
	
		
		
	}

}
