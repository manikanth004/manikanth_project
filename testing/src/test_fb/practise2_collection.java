package test_fb;


import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise2_collection {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement footer_loc;

		footer_loc=driver.findElement(By.xpath("//*[@id=\'pageFooterChildren\']"));
		List<WebElement> footer_links;
		footer_links=footer_loc.findElements(By.tagName("a"));
		
		for (int i = 0; i < footer_links.size(); i++) 
		{
			WebElement eachlink=footer_links.get(i);
			String text=eachlink.getText();
			String url=eachlink.getAttribute("href");
			System.out.println(text+" "+url);
			eachlink.click();
			Thread.sleep(3000);
			
			driver.navigate().back();
			Thread.sleep(3000);
			footer_loc=driver.findElement(By.xpath("//*[@id=\'pageFooterChildren\']"));
			footer_links=footer_loc.findElements(By.tagName("a"));
			
			
		}
		 

	}

}
