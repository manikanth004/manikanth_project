package test_fb;

import java.awt.datatransfer.SystemFlavorMap;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attributes_editbox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		 
		

		WebElement dep_loc=driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_view_date1')]"));
		String act_value=dep_loc.getAttribute("value");
		System.out.println(act_value);
	
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		String exp_value=sdf.format(d);	
		
		if(act_value.equals(exp_value))
		{
			System.out.println("as expected");
			
		}
		else
		{
			System.out.println("date mismatch");
			
		}
	}

}
