package test_fb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public  class datapro
{
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	String filepath="testdata\\Book1.xlsx";
	
	
	@Test(dataProvider="get_data")
	public void userLogin(String UID,String PWD) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("UID");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(PWD);
		
		Thread.sleep(4000);
		
		driver.getTitle();


		
		
	}
	
	
	@DataProvider
	public String [][] get_data()
	{
		int Rcount=sht.getLastRowNum();
		
		String data[][];
		data=new String[Rcount+1][1];
		for (int i = 0; i <= Rcount; i++) 
		{
			//Iterate for number of cells
			for (int j = 0; j < 1; j++) 
			{
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		
		return data;
	}
	
	
	

	@BeforeClass
	public void Pre_Condition() throws IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet1");
		
	}
	
	
	@AfterClass
	public void Createoutput() throws IOException
	{
		FileOutputStream fo=new FileOutputStream("testdata\\OP1.xlsx");
		book.write(fo);
		book.close();
	}

}
