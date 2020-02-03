package test_fb;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.testng.annotations.DataProvider;

public class excel_dataprovider 
{
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
  @Test(dataProvider = "dp")
  public void f(String user, String pwd)
  {
	  
  }

  @DataProvider
  public void dp() 
  {
	  int Rcount=sheet.getLastRowNum();
	  String data[][];
	  data=new String[Rcount+1][2];
	  for (int i = 0; i <= Rcount; i++) 
	  {
		  for (int j = 0; j < 2; j++)
		  {
			  sheet.getRow(i).getCell(j).getStringCellValue();
			
		}
		
	}
	  
	 
	  
	  
	  
	  
	  
	  
	  
    
  }
}
