package test_fb;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;

public class data_provider 
{
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String filepath="testdata\\Book1.xlsx";
	
  @Test(dataProvider = "dp")
  public void f(String user, String pwss) 
  {

  }

  @DataProvider
  public String[][] dp()
  {
	  int rcount=sheet.getLastRowNum();
	  
	  String data[][];
	  data=new String[rcount+1][2];
			  for (int i = 0; i <=rcount; i++)
			  {
				  for (int j = 0; j < 2; j++)
				  {
					  data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
					 }
				
			}
	
			  return data;
  }
  @BeforeClass
  public void beforeClass() throws IOException 
  {
	  FileInputStream file=new FileInputStream("filepath");
	  book=new XSSFWorkbook(file);
	  sheet=book.getSheet("Sheet1");  
  }

  @AfterClass
  public void afterClass() throws IOException 
  {
	  FileOutputStream fileout=new FileOutputStream("testdata\\outtput.xlsx");
	  book.write(fileout);
	  book.close();
	  
	  
  }

}
